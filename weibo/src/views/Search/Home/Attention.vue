<template>
  <div>
    <!-- <div class="publish">
      <div class="P_text">
        <textarea
          placeholder="有什么新鲜事要分享给大家？"
          :rows="2"
          class="p_text"
          v-model="text"
        >
        </textarea>
      </div>
      <div>
        <el-button class="my_button_1" type="warning" plain @click="addHost()">发布</el-button>
      </div>
    </div> -->

    <div class="mian">
      <el-tabs v-model="activeName" @tab-click="handleClick" class="tabs_v">
        <el-tab-pane label="全部" name="first">
          <div
            class="weibo"
            v-for="(item, index) in weiboTopic.topic"
            :key="index"
          >
            <div class="weibo_header">
              <!-- 头像 -->
              <el-avatar
                :size="65"
                class="weibo_avatar"
                :src="item.user_avg"
              ></el-avatar>
              <!-- 用户名 -->
              <div class="weibo_content">
                <span style="color: #000; font-size: 16px">
                  {{ item.user_nickname }}
                </span>
                <br />
                <!-- 发表时间 -->
                <div style="margin-top: 1px; line-height: 10px">
                  <span
                    class="weibo_content"
                    style="color: rgb(160, 161, 163); font-size: 13px"
                  >
                    {{ time }}前发布&nbsp;&nbsp;&nbsp;&nbsp;{{ item.user_cate }}
                  </span>
                </div>
              </div>
              <!-- 按钮 -->
              <div class="weibo_button">
                <!-- <el-button type="warning" plain>+&nbsp;&nbsp;关注</el-button> -->
                 <el-button class="my_button_2" type="warning" plain>+关注</el-button>
              </div>
            </div>
            <!-- 微博正文 -->
            <div calss="webo_text">
              <div class="webo_text">
                {{ item.user_title }}
              </div>
            </div>
            <!-- 图片 -->
            <div class="weibo_alum">
              <!--<el-image class="alums" :src="item.user_alum" ></el-image>
                           <el-image class="alums" :src="url" ></el-image>
                          <el-image class="alums" :src="url" ></el-image> -->
            </div>


            <!-- 图标行 -->
            <div class="weibo_icon">
              <div class="but">
                <el-button class="but_1"  icon="icon iconfont icon-zhuanfa" size="mini" circle
                  >
                  </el-button
                >{{ item.user_sharing }}
              </div>
              <div class="but">
                <el-button class="but_1"  icon="icon iconfont icon-pinglun" size="mini" circle
                  >
                  <!-- <i
                    class="icon iconfont icon-pinglun" size="mini" circle
                    style="font-size: 20px; color: rgb(155, 154, 154)"
                  ></i> -->
                  </el-button
                >{{ item.user_commnet.length }}
              </div>
              <div class="but" >
                
                  <el-button class="but_1" icon="icon iconfont icon-dianzan" size="mini" circle>
                  <!-- <i
                    class="icon iconfont icon-dianzan"
                    style="font-size: 20px; color: rgb(155, 154, 154)"
                  ></i> -->
                  </el-button>
                 {{ item.user_thum_up }}

            
                
              </div>
            </div>


          </div>
        </el-tab-pane>
        <el-tab-pane label="原创" name="second">
          <div
            class="weibo"
            v-for="(item, index) in weiboTopic.topic"
            :key="index"
          >
            <div class="weibo_header">
              <!-- 头像 -->
              <el-avatar
                :size="65"
                class="weibo_avatar"
                :src="item.user_avg"
              ></el-avatar>
              <!-- 用户名 -->
              <div class="weibo_content">
                <span style="color: #000; font-size: 16px">
                  {{ item.user_nickname }}
                </span>
                <br />
                <!-- 发表时间 -->
                <div style="margin-top: 1px; line-height: 10px">
                  <span
                    class="weibo_content"
                    style="color: rgb(160, 161, 163); font-size: 13px"
                  >
                    {{ time }}前发布&nbsp;&nbsp;&nbsp;&nbsp;{{ item.user_cate }}
                  </span>
                </div>
              </div>
              <!-- 按钮 -->
              <div class="weibo_button">
                <!-- <el-button type="warning" plain>+&nbsp;&nbsp;关注</el-button> -->
                 <el-button class="my_button_2" type="warning" plain>+关注</el-button>
              </div>
            </div>
            <!-- 微博正文 -->
            <div calss="webo_text">
              <p style="text-align: left; margin-left: 10px">
                {{ item.user_title }}
              </p>
            </div>
            <!-- 图片 -->
            <div class="weibo_alum">
              <el-image class="alums_2" :src="url"></el-image>
              
            </div>


            <!-- 图标行 -->
            <div class="weibo_icon">
              <div class="but">
                 <el-button class="but_1"  icon="icon iconfont icon-zhuanfa" size="mini" circle
                  >
                  <!-- <i
                    class="icon iconfont icon-zhuanfa"
                    style="font-size: 20px; color: rgb(155, 154, 154)"
                  ></i> -->
                  </el-button
                >
                {{ item.user_sharing }}
              </div>
              <div class="but">
                 <el-button class="but_1"  icon="icon iconfont icon-pinglun" size="mini" circle
                  >
                  <!-- <i
                    class="icon iconfont icon-pinglun"
                    style="font-size: 20px; color: rgb(155, 154, 154)"
                  ></i> -->
                  </el-button
                >
                {{ item.user_commnet.length }}
              </div>

              <div class="but" >
                 <el-button class="but_1" icon="icon iconfont icon-dianzan" size="mini" circle>
                  <!-- <i
                    class="icon iconfont icon-dianzan"
                    style="font-size: 20px; color: rgb(155, 154, 154)"
                  ></i> -->
                
                </el-button>
                  {{ item.user_thum_up }}
              </div>
            </div>
          </div>
        </el-tab-pane>
        <el-tab-pane label="视频" name="third">
          <el-empty :image-size="300"></el-empty>
        </el-tab-pane>
        <el-tab-pane label="超话社区" name="fourth">
          <el-empty :image-size="300"></el-empty>
        </el-tab-pane>
      </el-tabs>
    </div>
  </div>
</template>

<script type="text/javascript">
import userInfo from "@/assets/json/userInfo.json";
import weiboTopic from "@/assets/json/weiboTopic.json";

export default {

  name: "Attention",
  components: {},
  data() {
    return {
     
      activeName: "first",
      userInfo,
      text:'',
      weiboTopic,
      time: this.$moment().format("YYYY-MM-DD hh:mm:ss"),
      url: "https://pic4.zhimg.com/v2-dedcbc87988ab997d88d5db46615e7c5_r.jpg?source=1940ef5c",
    };
  },
 
  methods: {
    handleClick(tab, event) {
      console.log(tab, event);
    },
    addHost(){
      console.log("发布成功");
      

    },
    over(){
      let changeWidth = document.getElementById('')
    }
    
 
    
  },
};
</script>

<style scoped>
/* 微博卡片样式 */
.weibo_content {
  margin-top: 13px;

  /* border: 1px black solid; */
}

.weibo {
  margin-top: 10px;
  border-radius: 8px;
  background-color: white;
  /* border:gainsboro 1px solid; */
  /* box-shadow:    0px -10px -10px -10px gainsboro,    */
}
/* 微博卡片头部样式 */
.weibo_header {
  width: 630px;
  height: 80px;
  margin-left: 10px;
  display: flex;
  margin-right: 10px;
}
/* 微博头像样式 */
.weibo_avatar {
  margin-right: 10px;
  margin-top: 10px;
  /* border: 1px black solid; */
}
/* 微博（关注按钮样式） */
.weibo_button {
  display: flex;
  margin-left: 130px;
  margin-top: 10px;
  height: 40px;
  /* border: black 1px solid; */
}
/* 微博文章样式 */
.weibo_icon {
  width: 600px;
  height: 50px;
  display: flex;
  margin-top: 10px;
  margin-bottom: 10px;
  text-align: center;
  margin-bottom: 10px;
}
.but {
  width: 200px;
  margin-right: 10px;
  margin-top: 10px;
  
}
/* 图片样式 */
.alums {
  width: 30%;
  height: 200px;
  border-radius: 8px;
  margin-left: 15px;
}
.alums_2 {
  width: 40%;
  height: 200px;
  border-radius: 8px;
  margin-left: 15px;
}

.weibo_alum {
  margin-top: 10px;
}

.publish {
  width: 100%;
  height: 150px;
  background-color: white;
  margin-bottom: 10px;
  border-radius: 5px;
}
.p_text {
  margin-top: 30px;
  width: 90%;
  margin-left: 5%;
  background-color: white;
  border: 3px 3px 3px 3px gainsboro;
  border-radius: 5px;
  outline-color: orange;
  text-indent: 10px;
  line-height: 30px;
}
.my_button_1 {
  color: orange;
  background: white;
  border: #fbd9c4 solid;
  border-radius: 30px;
  padding: 12px 23px;
  margin-right: 15px;
  margin-top: 5px;
  text-align: center;
  font-size: 18px;
  float: right;
  -webkit-transform: scale(0.8);
  background-clip: text;
}
.P_text {
  display: flex;
}
.btn_1{
  border:white;
}

.but_1:hover {
  background-color: #fbd9c4;
  color: orange;
  cursor: pointer;
  border:#fbd9c4 solid;
}




</style>