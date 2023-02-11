<template>
  <div>
    <!-- 话题简介 -->
    <div class="one">
      <div class="test">
        <div class="bg test1"></div>
        <div class="blog_cards">
          <el-avatar
            class="card_avg"
            :size="70"
            :src="user.usersAvg"
          ></el-avatar>
          <div class="tu card_avg">
            <!-- 话题标题 -->
            <span class="tu_ti">{{ user.usersNickname }}</span>
            <!-- 话题阅读量 -->
            
              <div class="tu_it">
              粉丝：{{ user.usersFans }}&nbsp;&nbsp;
              <el-button @click="toAt(user.usersId)" type="text" class="at_1">我的关注  &nbsp;&nbsp; {{ atNum }}</el-button>
            
            </div>
          
          </div>
        </div>
        <!-- 下拉框 -->
        <div style="margin-left: 20px; margin-top: 10px">
          <el-collapse v-model="activeNames" @change="handleChange">
            <el-collapse-item title="" name="1">
              <div v-if="user.usersDes != null">
                {{ user.usersDes }}
              </div>
              <div v-else>
                <span>暂无简介</span>
              </div>

              <div>{{ user.usersSignupTime }}加入微博</div>
            </el-collapse-item>
          </el-collapse>
        </div>

        <div style="" class="a">
          <el-tabs v-model="activeName" @tab-click="handleClick" class="">
            <el-tab-pane label="精选" name="first">
            
              <div
                class="weibo"
                v-for="(item, index) in bolgData.data"
                :key="index"
              >
                <el-card class="box-card">
                  <div class="weibo_header">
                    <!-- 头像 -->
                    <el-avatar
                      :size="65"
                      class="weibo_avatar"
                      :src="user.usersAvg"
                    ></el-avatar>
                    <!-- 用户名 -->
                    <div class="weibo_content">
                      <span style="color: #000; font-size: 18px">
                        {{ user.usersNickname }}
                      </span>
                      <br />
                      <!-- 发表时间 -->
                      <div style="margin-top: 3px">
                        <span
                          class="weibo_content"
                          style="color: rgb(160, 161, 163); font-size: 13px"
                        >
                          {{ item.blogCreateTime }}
                        </span>
                      </div>
                    </div>
                    <!-- 按钮 -->
                    <div style="margin-left: 180px">

                      <!-- 删除按钮 -->
                      <el-button type="text" @click="qiqi = true"
                        ><i class="fa fa-trash"></i
                      ></el-button>
                      <!-- 弹出框 -->
                      <el-dialog
                        title="确定删除这条微博吗？"
                        :visible.sync="qiqi"
                      >
                        <div slot="footer" class="dialog-footer">
                          <el-button @click="qiqi = false">取 消</el-button>
                          <el-button
                            type="primary"
                            @click="del(item.blogId), (qiqi = false)"
                            >确 定</el-button
                          >
                        </div>
                      </el-dialog>

                      <!-- 修改微博 -->
                      <!-- 编辑按钮 -->
                      <el-button
                        type="text"
                        @click="find(item.blogId), (dialogFormVisible = true)"
                        style="margin-left: 30px"
                        ><i class="fa fa-pencil-square-o"></i
                      ></el-button>
                      <!-- 弹出框 -->
                      <el-dialog
                        title="修改微博"
                        :visible.sync="dialogFormVisible"
                      >
                        <el-form :model="form">
                          <el-form-item
                            label="微博内容"
                            :label-width="formLabelWidth"
                          >
                            <el-input
                              v-model="form.con"
                              autocomplete="off"
                            ></el-input>
                          </el-form-item>
                        </el-form>
                        <div slot="footer" class="dialog-footer">
                          <el-button @click="dialogFormVisible = false"
                            >取 消</el-button
                          >
                          <el-button
                            type="primary"
                            @click="
                               edit(form.id),
                               dialogFormVisible = false
                            "
                            >确 定</el-button
                          >
                        </div>
                      </el-dialog>
                    </div>
                  </div>
                  <!-- 微博正文 -->
                  <div calss="weibo_text">
                    <div class="webo_text">
                      {{ item.blogText }}
                    </div>
                  </div>
                  <!-- 图片 -->
                  <div class="weibo_alum">
                    <!-- <el-image class="alums" :src="item.hostTu4"></el-image> -->
                  </div>

                  <!-- 图标行-->
                  <div class="weibo_icon">
                    <div class="but">
                      <el-button
                        class="but_1"
                        icon="icon iconfont icon-zhuanfa"
                        size="mini"
                        circle
                      >
                      </el-button
                      >{{ item.blogSharing }}
                    </div>
                    <div class="but">
                      <el-button
                        class="but_1"
                        icon="icon iconfont icon-pinglun"
                        size="mini"
                        circle
                      >
                      </el-button
                      >{{ item.blogComment }}
                    </div>
                    <div class="but">
                      <el-button
                        class="but_1"
                        icon="icon iconfont icon-dianzan"
                        size="mini"
                        circle
                      >
                      </el-button
                      >{{ item.blogLike }}
                    </div>
                  </div>
                </el-card>
              </div>
            </el-tab-pane>
            <el-tab-pane label="微博" name="second">
              <el-empty :image-size="300"></el-empty>
            </el-tab-pane>
            <el-tab-pane label="相册" name="third">
              <el-empty :image-size="300"></el-empty>
            </el-tab-pane>
          </el-tabs>
        </div>
      </div>
    </div>
  </div>
</template>

<script type="text/javascript">
import moment from "moment";
export default {
  name: "My_one",
  data() {
    return {
      qiqi: false,
      dialogFormVisible: false,
      form: {   
        id: "",
        con: "",
      },
      formLabelWidth: "120px",
      bolgData: [],
      circleUrl:
        "https://cube.elemecdn.com/3/7c/3ea6beec64369c2642b92c6726f1epng.png",
      activeNames: ["1"],
      activeName: "second",
      time: this.$moment().locale("zh-cn").format("YYYY-MM-DD HH:mm:ss"),
      user: {},
      labelPosition: "right",
      formLabelAlign: {
        nickeName: "",
        des: "",
        gender: "f",
        location: "",
      },
      atNum:0
    };
  },
  mounted: function () {
    this.getData();
    this.IsLogin();
    this.blog();
    this.getAllPage();
  },

  methods: {
    //登录
    handleChange(val) {
      console.log(val);
    },
    handleClick(tab, event) {
      console.log(tab, event);
    },
    //用户登录
    getData() {
      // this.user = this.$route.query.userData;
      //判断用户是否登录
      let userInfo = JSON.parse(localStorage.getItem("userInfo"));
      if (null == userInfo) return;
      console.log("userInfo", userInfo.isLogin);
      if (userInfo.isLogin) {
        this.user = userInfo.userData;
        // console.log(this.user.usersId);
      }
    },
    IsLogin() {
      //判断用户是否登录
      let userInfo = JSON.parse(localStorage.getItem("userInfo"));
      if (null == userInfo) return;
      console.log("userInfo", userInfo.isLogin);
      if (userInfo.isLogin) {
        this.userDataInfo = userInfo.userData;
      }
    },

    //个人发表博客数据
    blog() {
      let postData = this.qs.stringify({
        userId: this.user.usersId,
      });
      this.axios({
        method: "post",
        url: "http://localhost:8082/blog/list",
        data: postData,
      })
        .then((resp) => {
          console.log("请求成功");
          console.log(resp.data.data);
          this.bolgData = resp.data;
        })
        .then((error) => {
          console.log(error);
        })
        .catch((e) => {
          console.log("请求错误");
        });
    },

    //删除
    del(blogId) {
      let postData = this.qs.stringify({
        blogId: blogId,
      });

      this.axios({
        method: "post",
        url: "http://localhost:8082/blog/delete",
        data: postData,
      })
        .then((resp) => {
          console.log("请求成功");
          this.$message("删除成功");
          console.log(resp.data);
        })
        .then((error) => {
          console.log(error);
        })
        .catch((e) => {
          console.log("请求错误");
        });
    },

    //根据id查询
    find(blogId) {
      let postData = this.qs.stringify({
        blogId: blogId,
      });
      this.axios({
        method: "post",
        url: "http://localhost:8082/blog/findById",
        data: postData,
      })
        .then((resp) => {
          console.log("查询成功");
          console.log(resp.data);
          // console.log();
          this.form.id = resp.data.data.blogId
          this.form.con = resp.data.data.blogText;

        })
        .then((error) => {
          console.log(error);
        })
        .catch((e) => {
          console.log("请求错误");
        });
    },

    //修改
    edit(id) {
       let postData = this.qs.stringify({
        blogId: id,
        blogText:this.form.con
      });
      this.axios({
        method: "post",
        url: "http://localhost:8082/blog/update",
        data: postData,
      })
        .then((resp) => {
          this.$message("修改数据成功");
          console.log(resp.data);
          // console.log();
        })
        .then((error) => {
          console.log(error);
        })
        .catch((e) => {
          console.log(e);
        });
      


    },

//跳转到关注页
    toAt(usersId){
      this.$router.push({
        name:"My_wb",
        params:{
          id:usersId
        }
      })

    },

    //
    getAllPage(){
      let postData = this.qs.stringify({
        usersId:this.user.usersId,
      });

       this.axios({
        method: "post",
        url: "http://localhost:8082/at/getAllSize",
        data: postData,
      })
        .then((resp) => {
          console.log(resp.data.data);
          //关注数
          this.atNum=resp.data.data;

        })
        .then((error) => {
          console.log(error);
        })
        .catch((e) => {
          console.log(e);
        });

    }

    
    
  },
};
</script>

<style  scoped>
.a {
  margin-right: 10px;
  margin-left: 10px;
}

.bg {
  background-image: url("https://cube.elemecdn.com/6/94/4d3ea53c084bad6931a56d5158a48jpeg.jpeg");
  background-repeat: no-repeat;
  width: 100%;
  height: 150px;
}

.card_avg {
  margin-top: -30px;
  margin-left: 10px;
}

.blog {
  width: 100px;
  height: 200px;
  border: 1px black solid;
}
/* 编辑、删除样式 */
.el-dropdown-link {
  cursor: pointer;
  color: black;
}
.el-icon-arrow-down {
  font-size: 12px;
}
/* .at_1{
  color: grey;
} */

</style>
