<template>
  <div>
    <el-card>
      <router-link to="/index_home"
        ><el-page-header content="评论详情页"></el-page-header
      ></router-link>
    </el-card>

    <div>
      <el-card style="margin-top: 5px;">
        <div class="weibo_header">
          <!-- 头像 -->
          <el-avatar
            :size="65"
            class="weibo_avatar"
            :src="Detaildata.hostTu"
          ></el-avatar>
          <!-- 用户名 -->
          <div class="weibo_content">
            <span style="color: #000; font-size: 18px">
              {{ Detaildata.hostTitle }}
            </span>
            <br />
            <!-- 发表时间 -->
            <div style="margin-top: 3px">
              <span
                class="weibo_content"
                style="color: rgb(160, 161, 163); font-size: 13px"
              >
                {{ Detaildata.hostTime }}
              </span>
            </div>
          </div>
          <!-- 按钮 -->
          <div class="weibo_button">
            <el-button
              class="my_button_2"
              type="warning"
              plain
              @click="attention()"
              >+关注</el-button
            >
          </div>
        </div>
        <!-- 微博正文 -->
        <div calss="weibo_text">
          <div class="webo_text">
            {{ Detaildata.hostWeiboText }}
          </div>
        </div>
        <!-- 图片 -->
        <div class="weibo_alum">
          <el-image class="alums" :src="Detaildata.hostTu4"></el-image>
        </div>

        <!-- 图标行-->
        <div class="weibo_icon">
          <div class="but">
            <el-button
              class="but_1 container"
              icon="icon iconfont icon-pinglun"
              size="mini"
              circle
              @click="toDetails()"
            >
            </el-button>
            {{ commentsCount }}
            <!-- {{ Detaildata.hostMdiybtn6 }} -->
          </div>

          <div class="but">
            <el-button
              class="but_1"
              icon="icon iconfont icon-zhuanfa"
              size="mini"
              circle
              title="一致性 Consistency"
              name=""
            >
            </el-button
            >{{ Detaildata.hostMdiybtn }}
          </div>

          <div class="but">
            <el-button
              class="but_1"
              icon="icon iconfont icon-dianzan"
              size="mini"
              circle
            >
            </el-button
            >{{ Detaildata.hostMdiybtn7 }}
          </div>
        </div>
        <hr style="border: none; border-top: 1px solid rgb(224, 222, 222)"/>
        <div class="publish">
          <div class="P_text">
            <textarea
              placeholder="发表你的评论"
              :rows="2"
              class="p_text"
              v-model="comText"
            >
            </textarea>
          </div>
          <!-- 发布评论 -->
          <div>
            <el-button
              class="my_button_1"
              type="warning"
              plain
              @click="addHost()"
              >发布</el-button
            >
          </div>
        </div>
        <hr style="border: none; border-top: 1px solid rgb(224, 222, 222)"/>
        <div class="com">
          <li class="la_2">以下是为博主精选的评论</li>
          <!-- 评论区域 -->

          <div
            v-for="(item, index) in comData.data"
            :key="index"
            class="com_tow"
          >
            <div class="weibo_header_2">
              <div class="weibo_avatar_1">
                <!-- 头像 -->
                <el-avatar
                  :size="40"
                  
                  :src="item.commentsAvg"
                ></el-avatar>
              </div>

              <!-- 用户名 -->
              <div class="weibo_com_1">
                <span style="color: #000; font-size: 13px; margin-top: 20px">
                  <a style="color: rgb(235, 57, 57); font-size: 13px"
                    >{{ item.commentsNickname }}&nbsp;&nbsp;</a
                  >:&nbsp;
                  {{ item.commentsText }}
                </span>

                <br />
                <!-- 发表时间 -->
                <div style="margin-top: 1px">
                  <span style="color: rgb(160, 161, 163); font-size: 12px">
                    {{ item.createTime }}
                  </span>
                </div>
              </div>
              <div class="web_ad">
                <div class="but_2">
                  <el-button
                    class="but_1 container"
                    icon="icon iconfont icon-pinglun"
                    size="mini"
                    circle
                  >
                  </el-button>
                </div>

                <div class="but_2">
                  <el-button
                    class="but_1"
                    icon="icon iconfont icon-zhuanfa"
                    size="mini"
                    circle
                    title="一致性 Consistency"
                    name=""
                  >
                  </el-button
                  >{{ item.hostMdiybtn }}
                </div>

                <div class="but_2">
                  <el-button
                    class="but_1"
                    icon="icon iconfont icon-dianzan"
                    size="mini"
                    circle
                  >
                  </el-button
                  >{{ item.hostMdiybtn7 }}
                </div>
              </div>
            </div>
          </div>
        </div>
        <!-- {{ tt }} -->
      </el-card>
    </div>
  </div>
</template>

<script>
import moment from "moment";
export default {
  name: "Comment",
  data() {
    return {
      hostData: {},
      Detaildata: this.$route.params.detailsData,
      id: this.$route.params.id,
      comData: {},
      user: {},
      comText: "",
      tt: this.$moment().format("YYYY-MM-DD HH:mm:ss"),
      commentsCount: 0,
    };
  },

  mounted: function () {
    this.getComments();
    // this.IsLogin();
    this.getAll();
  },
  methods: {
    getComments() {
      let postData = this.qs.stringify({
        hostId: this.id,
      });

      this.axios({
        method: "post",
        url: "http://localhost:8082/comments/findById",
        data: postData,
      })
        .then((resp) => {
          console.log(resp.data.data);
          this.comData = resp.data;
        })
        .then((error) => {
          console.log(error);
        });
    },

    //关注
    attention() {
      let userInfo = JSON.parse(localStorage.getItem("userInfo"));
      if (null == userInfo) {
        console.log("请先去登录");
        this.$message.success("请先去登录");
        // console.log("userInfo", userInfo.isLogin);
      } else {
        this.user = userInfo.userData;
        let postData = this.qs.stringify({
          userId: this.user.usersId,
          atAvg: this.Detaildata.hostTu,
          atNickname: this.Detaildata.hostTitle,
        });

        this.axios({
          method: "post",
          url: "http://localhost:8082/at/addAt",
          data: postData,
        })
          .then((resp) => {
            this.$message("关注成功");
            console.log(resp.data.data);
          })
          .then((error) => {
            console.log(error);
          });
      }
    },

    //发表评论
    addHost() {
      let userInfo = JSON.parse(localStorage.getItem("userInfo"));
      if (null == userInfo) {
        console.log("请先去登录");
        this.$message("请先去登录");
        // console.log("userInfo", userInfo.isLogin);
      } else {
        this.user = userInfo.userData;
        let postData = this.qs.stringify({
          hostId: this.id,
          commentsAvg: this.user.usersAvg,
          commentsNickname: this.user.usersNickname,
          commentsText: this.comText,
          createTime: this.tt,
        });

        this.axios({
          method: "post",
          url: "http://localhost:8082/comments/addComments",
          data: postData,
        })
          .then((resp) => {
            this.$message("评论成功");
            console.log(resp.data.data);
          })
          .then((error) => {
            console.log(error);
          });
      }
    },

    getAll() {
      let postData = this.qs.stringify({
        hostId: this.id,
      });

      this.axios({
        method: "post",
        url: "http://localhost:8082/comments/getAllSize",
        data: postData,
      })
        .then((resp) => {
          console.log(resp.data.data);
          this.commentsCount = resp.data.data;
        })
        .then((error) => {
          console.log(error);
        });
    },
  },
};
</script>

<style>
.com_tow {
  height: 60px;
  background-color: white;
  margin-top: 5px;
  margin: auto;
  display: flex;
  margin-top: 10px;
}
.com_tow:hover {
  background-color: #eee;
  cursor: pointer;
}
.weibo_com_1 {
  margin-top: 10px;
  width: 400px;
  height: 50px;
}
.weibo_avatar_1 {
  display: inline-block;
  vertical-align: middle;
  margin-right: 5px;
  margin-top: 5px;
  /* border: 1px black solid; */
}
.weibo_header_2 {
  margin-left: 5px;
  display: flex;
  margin-bottom: 5px;
}
.web_ad {
  width: 250px;
  height: 20px;
  float: right;
  margin-right: 5px;
  margin-top: 20px;
}
.but_2 {
  width: 40px;
  display: inline;
  margin-left: 10px;
}
.la_2 {
  margin-bottom: 10px;
  font-size: 12px;
}
</style>