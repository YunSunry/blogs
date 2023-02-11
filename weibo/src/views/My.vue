<template>
  <!-- 左边栏 -->
  <div class="index">
    <div class="index_left">
      <li class="li_left">个人主页</li>
      <div class="i_left">
        <router-link to="/My_one">
          <span
            class="fa fa-user-o"
            style="
              display: inline-block;
              width: 40px;
              text-align: center;
              font-size: 18px;
              margin-left: 20px;
            "
          ></span>
          我的主页
        </router-link>
      </div>
      <div class="i_left">
        <router-link to="/my_wb">
        <span
          class="fa fa-plus-square-o"
          style="
            display: inline-block;
            width: 40px;
            text-align: center;
            font-size: 18px;
            margin-left: 20px;
          "
        ></span>
        我的关注
        </router-link>
      </div>
      <div class="i_left">
        <!-- <router-link to=""> -->
        <span
          class="fa fa-user-o"
          style="
            display: inline-block;
            width: 40px;
            text-align: center;
            font-size: 18px;
            margin-left: 20px;
          "
        ></span>
        我的粉丝
        <!-- </router-link> -->
      </div>
      <div class="i_left">
        <!-- <router-link to=""> -->
        <span
          class="fa fa-star-o"
          style="
            display: inline-block;
            width: 40px;
            text-align: center;
            font-size: 18px;
            margin-left: 20px;
          "
        ></span>
        我的收藏
        <!-- </router-link> -->
      </div>
      <div class="i_left">
        <!-- <router-link to=""> -->
        <span
          class="fa fa-thumbs-o-up"
          style="
            display: inline-block;
            width: 40px;
            text-align: center;
            font-size: 18px;
            margin-left: 20px;
          "
        ></span>
        我的赞
        <!-- </router-link> -->
      </div>
      <div class="i_left">
        <router-link to="/Myself">
          <span
            class="fa fa-pencil-square-o"
            style="
              display: inline-block;
              width: 40px;
              text-align: center;
              font-size: 18px;
              margin-left: 20px;
            "
          ></span>
          编辑信息
        </router-link>
      </div>

      <div class="i_left">
          <span
            style="
              display: inline-block;
              width: 20px;
              text-align: center;
              font-size: 18px;
              margin-left: 20px;
            "
          ></span>
         <button @click="logout()">退出登录</button>
      </div>
    </div>

    <!-- 中间 -->
    <div class="index_middle inner">
      <router-view />
    </div>

    <!-- 右边 -->
    <div class="index_right">
      <div class="index_right_one">
        <li class="li">微博热搜</li>
        <div
          class="search"
          v-for="(item, index) in search.searches"
          :key="index"
        >
          <router-link
            :to="{ name: 'Host', query: { users: item.introduction } }"
            style="color: black; text-decoration: none"
          >
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
        <li class="la">你可能感兴趣的人</li>
        <hr style="border:none;border-top:1px solid rgb(224, 222, 222)">
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

<script>
import userInfo from "@/assets/json/userInfo.json";
import search from "@/assets/json/search.json";
import weiboTopic from "@/assets/json/weiboTopic.json";
export default {
  name: "My",
  data() {
    return {
      userInfo,
      search,
      weiboTopic,
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
   methods: {
     // 用户退出
    logout() {
      localStorage.clear();
      this.$message.info("退出登录")
    },
  }
};
</script>

<style>
</style>