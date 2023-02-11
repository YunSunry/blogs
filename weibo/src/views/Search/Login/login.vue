<template>
  <div class="login_index">
    <div class="login">
      <el-tabs type="border-card">
        <el-tab-pane label="登录">
          <el-form
            :label-position="labelPosition"
            label-width="80px"
            :model="formLabelAlign"
          >
            <el-form-item label="用户账号">
              <el-input v-model="formLabelAlign.account"></el-input>
            </el-form-item>
            <el-form-item label="密码">
              <el-input type="password"  prefix-icon="el-icon-lock" v-model="formLabelAlign.password" show-password></el-input>
            </el-form-item>
            <el-form-item>
              <el-button type="primary" @click="login()">登录</el-button>
              <el-button type="primary" plain @click="empty">取消</el-button>
            </el-form-item>
          </el-form>
        </el-tab-pane>
      </el-tabs>
    </div>
  </div>
</template>

<script>
export default {
  name: "Login",
  data() {
    return {
      labelPosition: "right",
      formLabelAlign: {
        account: "",
        password: "",
      },
      users: {},
      userDataInfo:null,
    };
  },
  methods: {
    empty(){
      this.formLabelAlign.account="";
      this.formLabelAlign.password=""
    },
    login() {
      let postData = this.qs.stringify({
        usersAccount: this.formLabelAlign.account,
        usersPassword: this.formLabelAlign.password,
      });
      this.axios({
        method: "post",
        url: "http://localhost:8082/u/login",
        data: postData,
      })
        .then((resp) => {
          if (resp.data.code == "200") {
            // console.log("登录成功");
            // this.$message.success("登录成功");
            console.log(resp.data.data);
            this.users = resp.data.data;
            let userInfo = {
              isLogin: true,
              userData: resp.data.data,
            };
            localStorage.setItem("userInfo", JSON.stringify(userInfo));
            if (this.users == null) {
              console.log("用户名或密码输入错误");
            } else {
              this.$message.success("登录成功");
              this.$store.state.userInfo = userInfo;
              console.log(
                "this.$store.state.userInfo",
                this.$store.state.userInfo
              );
              this.$router.push({
              path:'/my_one'})
            }
          }
        })
        .catch((error) => {
          console.log(error);
        });
    },
  },

};
</script>
 
<style scoped>
.login_index{
  width:100%;
  height: 800px;
  /* background-color: aquamarine; */
}
.login {
  width: 400px;
  height: 350px;
  position: absolute;
  left: 30%;
  right: 50%;
  top: 30%;
  bottom: 20%;
  border-radius: 8px;
}
.ipt {
  width: 200px;
  left: 5%;
  right: 15%;
  top: 10%;
  bottom: 20%;
}
.login_el_inp {
  margin-top: 5%;
}
.login_el_inp1 {
  margin-top: 10px;
}
.login_el_bt {
  margin-left: 35%;
  margin-top: 7%;
}
.login_li {
  margin-left: 50px;
}
</style>