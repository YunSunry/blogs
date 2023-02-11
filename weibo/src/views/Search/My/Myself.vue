<template>
  <div class="my">
    <div class="my_li">
      <li>账号信息设置</li>
    </div>
    <div class="my_avatar">
      <el-avatar :size="100" class="weibo_avatar" :src="userDataInfo.usersAvg"></el-avatar>
    </div>

    <el-form
      class="el_form"
      :label-position="labelPosition"
      label-width="80px"
      :model="formLabelAlign"
    >
      <el-form-item label="昵称:">
        <el-input v-model="userDataInfo.usersNickname"></el-input>
      </el-form-item>
      <el-form-item label="简介:">
        <el-input v-model="userDataInfo.usersDes"></el-input>
      </el-form-item>

      <el-form-item label="性别:">
        <el-radio-group v-model="userDataInfo.usersGender">
          <el-radio label="男"></el-radio>
          <el-radio label="女"></el-radio>
        </el-radio-group>
      </el-form-item>

      <el-form-item label="所在地：">
        <el-input v-model="userDataInfo.usersLocation"></el-input>
      </el-form-item>
    </el-form>

    <div style="margin-left:150px">
      <el-button type="primary" @click="editUser()">保存</el-button>
    </div>
    <div>
     &nbsp;&nbsp;&nbsp;
    </div>
  </div>
</template>

<script>
export default {
  name: "Myself",
  data() {
    return {
      labelPosition: "right",
      userDataInfo: {},
      formLabelAlign: {
        nickeName: "",
        des: "",
        gender: "",
        location: "",
      },
      url: "https://ts1.cn.mm.bing.net/th/id/R-C.2ad5d717e0270483d76388c9401bf2a4?rik=VmlMiYrvU51BWQ&riu=http%3a%2f%2fpic.22520.cn%2ftuku%2f200126%2f1580053140195738.jpg&ehk=bEZ021RiNDER5ck053syGhYPiz5c9OsRrqtVEUynq4I%3d&risl=&pid=ImgRaw&r=0&sres=1&sresct=1",
    };
  },
  mounted: function () {
    this.IsLogin();
  },

  methods: {
    onSubmit() {
      console.log("submit!");
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

    //跳转修改用户数据
    editUser() {
      let postData = this.qs.stringify({
        usersId: this.userDataInfo.usersId,
        usersNickname: this.userDataInfo.usersNickname,
        usersDes: this.userDataInfo.usersDes,
        usersGender: this.userDataInfo.usersGender,
        usersLocation: this.userDataInfo.usersLocation,
      });
      this.axios({
        method: "post",
        url: "http://localhost:8082/u/update",
        data: postData,
      })
        .then((resp) => {
          if (resp.data.code == "200") {
            this.$message("修改用户成功");
            console.log(resp.data.data);
          }
        })
        .catch((error) => {
          console.log(error);
          this.$message("修改用户信息失败");
        });
    },
  },
};
</script>

<style scoped>
.my {
  background-color: white;
}
.my_avatar {
  margin-left: 230px;
}
.my_li {
  margin-left: 10px;
  margin-top: 10px;
}
.el_form {
  margin: 30px;
}
.my_el_it {
  background-color: gainsboro;
}
</style>