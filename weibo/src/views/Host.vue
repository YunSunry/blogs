<template>
  <!-- 左边栏 -->
  <div class="index">
    <div class="index_left">
      <div class="i_left">
        <!-- <router-link to="/topic_details"> -->
        <span
          class=""
          style="
            display: inline-block;
            width: 40px;
            text-align: center;
            font-size: 18px;
            margin-left: 22px;
          
          "
        ></span>
        <i style="color:orange;">综合</i>
        <!-- </router-link> -->
      </div>
      <div class="i_left">
        <!-- <router-link to=""> -->
        <span
          class=""
          style="
            display: inline-block;
            width: 40px;
            text-align: center;
            font-size: 18px;
            margin-left: 20px;
          "
        ></span>
        实时
        <!-- </router-link> -->
      </div>
      <div class="i_left">
        <!-- <router-link to=""> -->
        <span
          class=""
          style="
            display: inline-block;
            width: 40px;
            text-align: center;
            font-size: 18px;
            margin-left: 20px;
          "
        ></span>
        热门
        <!-- </router-link> -->
      </div>
      <div class="i_left">
        <!-- <router-link to=""> -->
        <span
          class=""
          style="
            display: inline-block;
            width: 40px;
            text-align: center;
            font-size: 18px;
            margin-left: 20px;
          "
        ></span>
        视频
        <!-- </router-link> -->
      </div>
      <div class="i_left">
        <!-- <router-link to=""> -->
        <span
          class=""
          style="
            display: inline-block;
            width: 40px;
            text-align: center;
            font-size: 18px;
            margin-left: 20px;
          "
        ></span>
        图片
        <!-- </router-link> -->
      </div>
      <div class="i_left">
        <!-- <router-link to=""> -->
        <span
          class=""
          style="
            display: inline-block;
            width: 40px;
            text-align: center;
            font-size: 18px;
            margin-left: 20px;
          "
        ></span>
        高级搜索
        <!-- </router-link> -->
      </div>
    </div>

    <!-- 中间 -->
    <div class="index_middle inner">
     
      <div v-for="(item, index) in datas" :key="index">
        <!-- 话题简介 -->
        <div class="one">
          <div class="test">
            <div class="bg test1">
              <router-link to="/Billboard">
                 <el-page-header style="color:white"></el-page-header>
              </router-link>
            </div>
            <div class="blog_cards">
              <el-avatar class="card_avg" :size="70" :src="url"> 
              </el-avatar>
              <div class="tu card_avg">
                <!-- 话题标题 -->
                <span class="tu_ti">#{{ item.title }}#</span>
                <!-- 话题阅读量 -->
                <div class="tu_it">
                  粉丝：{{ item.host }}&nbsp;&nbsp;观看：{{ item.read }}&nbsp;&nbsp;点赞：{{
                    item.comment
                  }}
                </div>
              </div>
            </div>
            <!-- 导语 -->
            <li class="li_con" style="font-size: 13px">{{ item.context }}</li>
            <!-- 发布区域 -->
            <div class="el">
              <div class="el1">
                <!-- 头像 -->
                <el-avatar :size="40" :src="url"> </el-avatar>
                <!-- 输入框 -->
                <el-input
                  type="textarea"
                  :rows="2"
                  placeholder="请输入内容"
                  v-model="textarea"
                  class="input"
                >
                </el-input>
              </div>
              <!-- 发布按钮 -->
              <dvi >
            
               <el-button class="my_button_1" type="warning" plain @click="addHost()">发布</el-button>
              </dvi>
            </div>
          </div>
        </div>

        <!-- 有关话题的微博 -->
        <div
          class="weibo"
          v-for="(item1, index1) in item.list_introduction"
          :key="index1"
        >
          <div class="weibo_header">
            <!-- 头像 -->
            <el-avatar
              :size="65"
              class="weibo_avatar"
              :src="item1.user_pr"
            ></el-avatar>
            <!-- 用户名 -->
            <div class="weibo_content">
              <span style="color: #000; font-size: 18px"
                >{{ item1.user_name }}
              </span>
              <br />
              <!-- 发表时间 -->
              <div style="margin-top: 3px">
                <span
                  class="weibo_content"
                  style="color: rgb(160, 161, 163); font-size: 13px"
                >
                  {{ item1.user_name }}&nbsp;&nbsp;{{
                    item1.user_tiem
                  }}&nbsp;&nbsp;前发布
                </span>
              </div>
            </div>
            <!-- 按钮 -->
            <div class="weibo_button">
             
              <el-button class="my_button_2" type="warning" plain>+关注</el-button>
            </div>
          </div>
          <!-- 微博正文 -->
          <div calss="webo_text">
            <div class="webo_text">{{ item1.user_cotext }}</div>
          </div>
          <!-- 图片 -->
          <div class="weibo_alum">
            <!-- <el-image class="alums" :src="item1.user_tu"></el-image>
            <el-image class="alums" :src="url"></el-image> -->
          </div>
          <!-- 图标行(转发+评论+点赞) -->
          <div class="weibo_icon">
            <div class="but"> 
              <!-- 转发按钮 -->
                <el-button class="but_1"  icon="icon iconfont icon-zhuanfa" size="mini" circle>
              
                </el-button
              >{{ item1.user_zhuanfa }}
            </div>
            <div class="but">
              <!-- 评论按钮 -->
                <el-button class="but_1"  icon="icon iconfont icon-pinglun" size="mini" circle >
               
                </el-button
              >{{ item1.user_like }}
            </div>
            <div class="but">
              <!-- 点赞按钮 -->
                <el-button class="but_1" icon="icon iconfont icon-dianzan" size="mini" circle>
               
                </el-button
              >{{ item1.user_comment }}
            </div>
          </div>
        </div>
      </div>
    </div>
     <!-- 中间 -->
     <!-- <div class="index_middle inner">
        <router-view />
    </div> -->




    <!-- 右边 -->
    <div class="index_right">
      <div class="index_right_one">
        <li class="li">微博热搜</li>
        <div
          class="search"
          v-for="(item, index) in search.searches"
          :key="index"
        >
          <router-link :to="{name:'Host',query:{users: item.introduction}}" style="color: black; text-decoration: none">
            <hr
              style="border: none; border-top: 1px solid rgb(224, 222, 222)"
            />
            <div class="title_css">
             <i style="color:red;">{{item.id}}</i>&nbsp;
              {{ item.title | ellipsis }}
              <span class="i">{{ item.host }}</span>
            </div>
          </router-link>
        </div>
      </div>
      <div class="index_right_tow">
        <div
          class="i_tow"
          v-for="(item, index) in weiboTopic.topic"
          :key="index"
        >
          <el-avatar
            :size="35"
            class="weibo_avatar"
            :src="item.user_avg"
          ></el-avatar>
          <a class="i_text"> {{ item.user_nickname }}</a>

          <el-button class="my_button" type="warning" plain>+关注</el-button>
        </div>
      </div>

      <div class="index_right_bottom">
        <div class="help">
          <div
            class=""
            style="font-size: 13px; color: #606060; margin-bottom: 5px"
          >
            帮助中心
          </div>
          <span class="i_bot">微博客服4000-960-960</span>
          <span class="i_bot">自助服务中心</span>
          <span class="i_bot">常见问题</span>
        </div>
        <div class="help">
          <div
            class=""
            style="font-size: 13px; color: #606060; margin-bottom: 5px"
          >
            合作&服务
          </div>
          <span class="i_bot">微博营销</span>
          <span class="i_bot">合作热线4000-980-980</span>
          <span class="i_bot"> 开放平台</span>
          <span class="i_bot">更多</span>
        </div>

        <div class="help">
          <div
            class=""
            style="font-size: 13px; color: #606060; margin-bottom: 5px"
          >
            举报中心
          </div>
          <span class="i_bot">违规投诉010-60618076</span>
          <span class="i_bot">处理大厅</span>
          <span class="i_bot">舞弊举报</span>
          <span class="i_bot">更多</span>
        </div>

        <div class="help">
          <div
            class=""
            style="font-size: 13px; color: #606060; margin-bottom: 5px"
          >
            关于微博
          </div>
          <span class="i_bot">About Weibo</span>
          <span class="i_bot">客户端下载</span>
          <span class="i_bot">微博招聘</span>
          <span class="i_bot">网站备案信息</span>
        </div>

        <div class="help">
          <span class="iconfont icon-weibo"></span>
          <span>Copyright © 2009-2022 营业执照</span>
        </div>
      </div>
    </div>
  </div>
</template>

<script type="text/javascript">
import userInfo from "@/assets/json/userInfo.json";
import search from "@/assets/json/search.json";
import weiboTopic from "@/assets/json/weiboTopic.json";
export default {
  name: "Host",
  data() {
    return {
      search,
      weiboTopic,
      userInfo,
      textarea: "",
      datas: this.$route.query.users,
      url: "https://www.com8.cn/wp-content/uploads/2021/01/20210115082839-60015237595cb.jpg",
    };
  },
  filters: {
    //文字数超出时，超出部分使用...
    ellipsis(value) {
      if (!value) return "";
      if (value.length > 10) {
        return value.slice(0, 10) + "...";
      }
      return value;
    },
  },
  mounted() {},
  methods: {
  },
};
</script>

<style  scoped>
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
  -webkit-transform: scale(0.7);
  background-clip: text;
}
.one{
  height: 380px;
}

</style>