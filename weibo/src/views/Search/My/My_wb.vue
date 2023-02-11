<template>
  <div>
    <!-- fhruhfurhfur
    <button @click="getComments()">拿数据</button>
    {{commentsDate}}
   
    <button @click="del()">删除数据</button> -->
    <el-menu class="el-menu-demo" mode="horizontal">
      <el-menu-item index="1" style="color: red">关注的人</el-menu-item>
      <el-menu-item index="2">超话</el-menu-item>
      <el-menu-item index="3">话题</el-menu-item>
      <el-menu-item index="4">经常访问</el-menu-item>
    </el-menu>

    <div>
      <el-card style="margin-top: 5px;">
        <li class="la_1">关注的人</li>

        <div v-for="(item, index) in atData.data" :key="index">
          <div class="at">
            <div class="weibo_header_3">
              <!-- 头像 -->
              <div class="weibo_avatar_3">
                <el-avatar
                  :size="45"
                  class="weibo_avatar_5"
                  :src="item.atAvg"
                ></el-avatar>
                <!-- 用户名 -->
              </div>

              <div class="weibo_com_2">
                <span style="color: #000; font-size: 13px; margin-top: 10px">
                  {{ item.atNickname }}
                </span>

                <!-- 简介 -->
                <div style="margin-top: 1px">
                  <span style="color: rgb(160, 161, 163); font-size: 12px">
                    {{ item.atDes }}
                  </span>
                </div>
              </div>
              <div class="wb_at">
                <el-button class="my_button_1" plain @click="open(item.atId)">已关注</el-button>
              </div>
            </div>
          </div>
        </div>
      </el-card>
    </div>
  </div>
</template>

<script>
export default {
  name: "My_wb",
  data() {
    return {
      atData: {},
      commentsDate: {},
      atId: this.$route.params.id,
      activeName: "1",
    };
  },
  mounted: function () {
    this.getAtData();
  },
  methods: {
    getAtData() {
      let postData = this.qs.stringify({
        usersId: this.atId,
      });
      this.axios({
        method: "post",
        url: "http://localhost:8082/at/findByAtId",
        data: postData,
      })
        .then((resp) => {
          console.log(resp.data.data);

          this.atData = resp.data;
        })
        .then((error) => {
          console.log(error);
        });
    },
    //删除数据
    open(atId) {
      this.$confirm("是否要取消关注", "提示", {
        confirmButtonText: "确定",
        cancelButtonText: "取消",
        type: "warning",
      })
        .then(() => {
          this.$message({
            type: "success",
            message: "已取消关注",
          });

          if (atId > 0) {
            console.log("已取消关注的用户id是" + atId);
            let postData = this.qs.stringify({
              atId: atId,
            });
            this.axios({
              method: "post",
              url: "http://localhost:8082/at/deleteById",
              data: postData,
            })
              .then((resp) => {
                console.log("取消关注用户成功");
                console.log(resp.data.data);
              })
              .then((error) => {
                console.log(error);
              });
          }
        })
        .catch(() => {
          this.$message({
            type: "info",
            message: console.log("已取消"),
          });
        });
    },
  },
};
</script>

<style>
.wb_2 {
  margin-top: 10px;
}
.at {
  height: 65px;
  background-color: white;
}
.weibo_avatar_5 {
  display: inline-block;
  vertical-align: middle;
  margin-right: 15px;
  margin-top: 10px;
}
.at:hover {
  background-color: #eee;
  cursor: pointer;
}
.weibo_header_3 {
  margin-left: 10px;
  display: flex;
  margin-bottom: 5px;
}
.weibo_com_2 {
  margin-top: 10px;
  width: 500px;
  height: 50px;
}
.weibo_avatar_3 {
  display: inline-block;
  vertical-align: middle;
  margin-right: 5px;
}
.wb_at {
  width: 100px;
  height: 45px;
  float: right;

  margin-top: 10px;
}
.my_button_1 {
  color: black;
  background: white;
  border: black solid;
  border-radius: 30px;
  padding: 10px 15px;
  margin-right: 5px;
  margin-bottom: 20px;

  text-align: center;
  font-size: 17px;
  float: right;
  -webkit-transform: scale(0.7);
  background-clip: text;
}
.la_1 {
  margin-bottom: 10px;
  font-size: 14px;
}
</style>