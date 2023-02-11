<template>
  <div class="inner">
    <div class="inner">
      <!-- 小的标题栏 -->
      <el-menu class="el-menu-demo" mode="horizontal">
        <el-menu-item index="1" style="color: red">小时榜</el-menu-item>
        <el-menu-item index="2">昨日</el-menu-item>
        <el-menu-item index="3">前日</el-menu-item>
        <el-menu-item index="4">周榜</el-menu-item>
        <el-menu-item index="5">男榜</el-menu-item>
        <el-menu-item index="6">女榜</el-menu-item>
      </el-menu>

      <!-- weibo卡片-->
      <div class="weibo" v-for="(item, index) in weibo.weibos" :key="index">
        <div class="weibo_header">
          <!-- 头像 -->
          <el-avatar
            :size="65"
            class="weibo_avatar"
            :src="item.user_avg"
          ></el-avatar>
          <!-- 用户名 -->
          <div class="weibo_content">
            <span style="color: #000; font-size: 18px"
              >{{ item.user_name }}
            </span>
            <br />
            <!-- 发表时间 -->
            <div style="margin-top: 3px">
              <span
                class="weibo_content"
                style="color: rgb(160, 161, 163); font-size: 13px"
              >
                {{ item.address }}&nbsp;&nbsp;{{ item.time }}&nbsp;&nbsp;前发布
              </span>
            </div>
          </div>
          <!-- 按钮 -->
          <div class="weibo_button">
            <el-button class="my_button_2" type="warning" plain
              >+关注</el-button
            >
          </div>
        </div>
        <!-- 微博正文 -->
        <div calss="webo_text">
          <div class="webo_text">
            &nbsp;&nbsp;&nbsp;&nbsp;{{ item.context }}
          </div>
        </div>
        <!-- 图片 -->
        <div class="weibo_alum">
          <!-- <el-image class="alums" :src="url"></el-image>
          <el-image class="alums" :src="url"></el-image> -->
        </div>
        <!-- 图标行(转发+评论+点赞) -->
        <div class="weibo_icon">
          <div class="but">
            <!-- 转发按钮 -->
            <el-button
              class="but_1"
              icon="icon iconfont icon-zhuanfa"
              size="mini"
              circle
            >
            </el-button
            >{{ item.relay }}
          </div>
          <div class="but">
            <!-- 评论按钮 -->
            <el-button
              class="but_1"
              icon="icon iconfont icon-pinglun"
              size="mini"
              circle
            >
            </el-button
            >{{ item.comment }}
          </div>
          <div class="but">
            <!-- 点赞按钮 -->
            <el-button
              class="but_1"
              icon="icon iconfont icon-dianzan"
              size="mini"
              circle
            >
            </el-button
            >{{ item.like }}
          </div>
        </div>
      </div>
    </div>
    <!-- </div> -->
  </div>
</template>

<script type="text/javascript">
import userInfo from "@/assets/json/userInfo.json";
import weibo from "@/assets/json/weibo.json";
export default {
  name: "Search",
  data() {
    return {
      weibo,
      userInfo,
      url: "https://ts1.cn.mm.bing.net/th/id/R-C.b6013f7862c5aff84da34c41436ae889?rik=JmNIGpTcUx4%2bGg&riu=http%3a%2f%2fimg.crcz.com%2fallimg%2f201911%2f25%2f1574645550824058.jpeg&ehk=rdcuvgQp1o4dqhWw1X7WR0cAl%2bzcbR9JW505LPm%2bwYM%3d&risl=&pid=ImgRaw&r=0",
    };
  },
  components: {},
};
</script>
<style scoped>
/* 微博卡片样式 */
.weibo_content {
  margin-top: 18px;
}
.weibo {
  margin-top: 10px;
  border-radius: 8px;
  background-color: white;
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
  /* margin-right: 10px; */
  margin-top: 10px;
}
/* 微博（关注按钮样式） */
.weibo_button {
  display: flex;
  margin-left: 180px;
  margin-top: 20px;
  height: 40px;
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
}

/* 图片样式 */
.alums {
  width: 30%;
  height: 200px;
  border-radius: 8px;
  margin-left: 15px;
}
.weibo_alum {
  margin-top: 10px;
}

/* 左边的样式 */
.index_left {
  width: 210px;
  background-color: white;
  border-radius: 10px;
  margin-bottom: 10px;
}
.el-menu-demo {
}
</style>