<template>
  <div class="inner">
    <div class="inner">
      <!-- 小的标题栏 -->
      <el-menu
        class="el-menu-demo"
        mode="horizontal">
        <el-menu-item index="1" style="color: red">热门</el-menu-item>
        <el-menu-item index="2">二十大</el-menu-item>
        <el-menu-item index="3">榜单</el-menu-item>
        <el-menu-item index="4">周榜</el-menu-item>
        <el-menu-item index="5">明星</el-menu-item>
        <el-menu-item index="6">搞笑</el-menu-item>
      </el-menu>
      <!-- weibo卡片-->
      <div class="weibo" v-for="(item, index) in weiboTopic.topic" :key="index">
        <div class="weibo_header" >
          <!-- 头像 -->
          <el-avatar :size="65" class="weibo_avatar" :src="item.user_avg"></el-avatar>
          <!-- 用户名 -->
          <div class="weibo_content">
            <span style="color: #000; font-size: 18px"> {{item.user_nickname}} </span>
            <br/>
            <!-- 发表时间 -->
            <div style="margin-top: 3px">
              <span class="weibo_content" style="color: rgb(160, 161, 163); font-size: 13px">
                {{item.user_cate}}&nbsp;&nbsp;{{time}}&nbsp;&nbsp;前发布
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
          <!-- <el-image class="alums" :src="url"></el-image>
          <el-image class="alums" :src="url"></el-image> -->
        </div>
        <!-- 图标行 -->
        <div class="weibo_icon">
          <div class="but">
             <el-button class="but_1"  icon="icon iconfont icon-zhuanfa" size="mini" circle>
               <!-- <i class="icon iconfont icon-zhuanfa" style="font-size: 20px;color:rgb(155, 154, 154);"></i> -->
             </el-button>{{ item.user_sharing }}
          </div>
          <div class="but">
            <el-button class="but_1"  icon="icon iconfont icon-pinglun" size="mini" circle >
               <!-- <i class="icon iconfont icon-pinglun" style="font-size: 20px;color:rgb(155, 154, 154);"></i> -->
             </el-button>{{ item.user_commnet.length }}
          </div>
          <div class="but">
             <el-button class="but_1" icon="icon iconfont icon-dianzan" size="mini" circle>
               <!-- <i class="icon iconfont icon-dianzan" style="font-size: 20px;color:rgb(155, 154, 154);"></i> -->
              </el-button>{{ item.user_thum_up }}
          </div>
        </div>
      </div>
    </div>


  </div>
</template>

<script type="text/javascript">
import userInfo from "@/assets/json/userInfo.json";
import weiboTopic from "@/assets/json/weiboTopic.json";
export default {
  name: "Weibo",
  data() {
    return {
      userInfo,
      weiboTopic,
      time: this.$moment().format("YYYY-MM-DD hh:mm:ss"),
      url: "https://pic4.zhimg.com/v2-dedcbc87988ab997d88d5db46615e7c5_r.jpg?source=1940ef5c",
    };
  },
};
</script>

<style scoped>
/* 微博卡片样式 */
.weibo_content {
  margin-top: 18px;
  /* border: 1px black solid; */
}
/* 隐藏横向滚动条 */
.inner {
  overflow: auto;
}
.inner::-webkit-scrollbar {
  width: 0 !important;
}
.weibo {
  margin-top: 10px;
  border-radius: 8px;
  background-color: white;
 
}
/* 微博卡片头部样式 */
.weibo_header {
  height: 80px;
  display: flex;
  margin-right: 10px;
  /* border: 1px black solid; */
}
/* 微博头像样式 */
.weibo_avatar{
  /* margin-right: 10px; */
  margin-top: 10px;
  /* border: 1px black solid; */
}
/* 微博（关注按钮样式） */
.weibo_button{
  display: flex;
  margin-left: 130px;
  margin-top:20px;
  height: 40px;
  /* border: black 1px solid; */
} 
/* 微博文章样式 */
.weibo_icon{
  width: 600px;
  height: 50px;
  display:flex;
  margin-top: 10px;
  margin-bottom: 10px;
  text-align: center;
  margin-bottom: 10px;
}
.but{
  width: 200px;
  margin-right: 10px;
}
/* 图片样式 */
.alums {
  width: 30%;
  height: 200px;
  border-radius: 8px;
  margin-left: 15px;
}
.weibo_alum{
  margin-top: 10px;
}

</style>