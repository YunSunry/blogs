<template>
  <div class="inner">
    <div class="publish">
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
        <el-button class="my_button_1" type="warning" plain @click="addHost()"
          >发布</el-button
        >
      </div>
    </div>
    <div class="weibo" v-for="(item, index) in hostData" :key="index">
      <div class="weibo_header">
        <!-- 头像 -->
        <el-avatar
          :size="65"
          class="weibo_avatar"
          :src="item.hostTu"
        ></el-avatar>
        <!-- 用户名 -->
        <div class="weibo_content">
          <span style="color: #000; font-size: 18px">
            {{ item.hostTitle }}
          </span>
          <br />
          <!-- 发表时间 -->
          <div style="margin-top: 3px">
            <span
              class="weibo_content"
              style="color: rgb(160, 161, 163); font-size: 13px"
            >
              {{ item.hostTime }}
            </span>
          </div>
        </div>
        <!-- 按钮 -->
        <div class="weibo_button">
          <el-button class="my_button_2" type="warning" plain>+关注</el-button>
        </div>
      </div>
      <!-- 微博正文 -->
      <div calss="weibo_text">
        <div class="webo_text">
          {{ item.hostWeiboText }}
        </div>
      </div>
      <!-- 图片 -->
      <div class="weibo_alum">
        <el-image class="alums" :src="item.hostTu4"></el-image>
      </div>

      <!-- 图标行-->
      <div class="weibo_icon">
        <div class="but">
          <el-button
            class="but_1 container"
            icon="icon iconfont icon-pinglun"
            size="mini"
            circle
            @click="toDetails(item.hostId)"
          >
          </el-button>

          {{ item.hostMdiybtn6 }}
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
          >{{ item.hostMdiybtn }}
        </div>

        <div class="but">
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

    <!-- 点击加载更多 -->
  </div>
</template>

<script>
import collapse from "@/assets/js/collapse.js";
export default {
  name: "Index_home",
  data() {
    return {
      commentsDate: {},
      activeNames: ["2"],
      hostData: {},
      detailsData: {},
      text: "",
      startRow: 1,
      tt: this.$moment().format("YYYY-MM-DD HH:mm:ss"),
      userDataInfo: {},
      hostTime: this.$moment().format("YYYY-MM-DD HH:mm:ss"),
      url: "https://img2.woyaogexing.com/2020/05/26/3a87823adc644bb288f5e3dea1fd4442!400x400.jpeg",
    };
  },
  components: {
    collapse,
  },

  mounted: function () {
    this.getDate();
    // this.IsLogin();
    // this.getComments();
  },

  methods: {
    handleChange(val) {
      console.log(val);
    },

    //获取数据
    getDate() {
      this.axios({
        method: "post",
        url: "http://localhost:8082/host/list",
      })
        .then((resp) => {
          console.log(resp.data);
          this.hostData = resp.data.data;
        })
        .then((error) => {
          console.log(error);
        });
    },

    //判断是否登录
    // IsLogin() {
    //   //判断用户是否登录
    //   let userInfo = JSON.parse(localStorage.getItem("userInfo"));
    //   if (null == userInfo) return;
    //   console.log("userInfo", userInfo.isLogin);
    //   if (userInfo.isLogin) {
    //     this.userDataInfo = userInfo.userData;
    //   }
    // },

    //添加Host
    addHost() {
      //判断用户是否登录
      let userInfo = JSON.parse(localStorage.getItem("userInfo"));
      if (null == userInfo) {
        this.$message("请先去登录");
      } else {
        this.userDataInfo = userInfo.userData;

        let postData = this.qs.stringify({
          userId: this.userDataInfo.usersId,
          blogText: this.text,
          blogCreateTime: this.tt,
        });
        this.axios({
          method: "post",
          url: "http://localhost:8082/blog/insert",
          data: postData,
        })
          .then((resp) => {
            this.$message.success("发布成功");
            console.log(resp.data);
            // this.data = resp.data.data;
          })
          .then((error) => {
            console.log(error);
          });
      }
    },

    //评论
    isActive() {
      console.log();
    },

    //拿评论数据
    getComments(hostId) {
      let postDate = this.qs.stringify({
        hostId: hostId,
      });
      console.log(hostId);
      this.axios({
        method: "post",
        url: "http://localhost:8082/comments/findById",
        data: postDate,
      })
        .then((resp) => {
          console.log(resp.data.data);
          this.commentsDate = resp.data.data;
        })
        .then((error) => {
          console.log(error);
        })
        .catch((e) => {
          console.log("请求错误");
        });
    },

    //跳转到详情页
    toDetails(hostId) {
      let postDate = this.qs.stringify({
        hostId: hostId,
      });
      this.axios({
        method: "post",
        url: "http://localhost:8082/host/findByHostId",
        data: postDate,
      })
        .then((resp) => {
          console.log(resp.data.data);
          // this.detailsData = resp.data.data;
          this.$router.push({
            name: "Comment",
            params: {
              detailsData: resp.data.data,
              id: hostId,
            },
          });
        })
        .then((error) => {
          console.log(error);
        });
    },
  },
};
</script>

<style>
.home_one {
  background-color: white;
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
</style>