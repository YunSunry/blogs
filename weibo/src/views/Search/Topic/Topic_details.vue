<template>
  <!-- 中间 -->
  <div class="index_middle inner">
    <div v-for="(item, index) in datas" :key="index">
      <!-- 话题简介 -->
      <div class="one">
        <div class="test">
          <div class="bg test1"></div>
          <div class="blog_cards">
            <el-avatar class="card_avg" :size="70" :src="url"> </el-avatar>
            <div class="tu card_avg">
              <!-- 话题标题 -->
              <span class="tu_ti">#{{ item.title }}#</span>
              <!-- 话题阅读量 -->
              <div class="tu_it">
                粉丝：{{ item.host }}&nbsp;&nbsp;观看：{{
                  item.read
                }}&nbsp;&nbsp;点赞：{{ item.comment }}
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
            <div
              style="margin-left: 500px; margin-top: 5px; margin-bottom: 5px"
            >
              <el-button type="warning" plain>发布</el-button>
            </div>
          </div>
        </div>
     

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
            <el-button type="warning" plain>+&nbsp;&nbsp;关注</el-button>
          </div>
        </div>
        <!-- 微博正文 -->
        <div calss="webo_text">
          <div class="webo_text">{{ item1.user_cotext }}</div>
        </div>
        <!-- 图片 -->
        <div class="weibo_alum">
          <el-image class="alums" :src="item1.user_tu"></el-image>
          <el-image class="alums" :src="url"></el-image>
        </div>
        <!-- 图标行(转发+评论+点赞) -->
        <div class="weibo_icon">
          <div class="but">
            <!-- 转发按钮 -->
            <el-button type="text"
              ><i
                class="icon iconfont icon-zhuanfa"
                style="font-size: 20px; color: rgb(155, 154, 154)"
              ></i></el-button
            >{{ item1.user_zhuanfa }}
          </div>
          <div class="but">
            <!-- 评论按钮 -->
            <el-button type="text"
              ><i
                class="icon iconfont icon-pinglun"
                style="font-size: 20px; color: rgb(155, 154, 154)"
              ></i> </el-button
            >{{ item1.user_like }}
          </div>
          <div class="but">
            <!-- 点赞按钮 -->
            <el-button type="text"
              ><i
                class="icon iconfont icon-dianzan"
                style="font-size: 20px; color: rgb(155, 154, 154)"
              ></i></el-button
            >{{ item1.user_comment }}
          </div>
        </div>
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
  name: "Topic_details",
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
  methods: {},
};
</script>
<style>
</style>