<template>
  <div>
    <el-container>
      <!--顶部导航栏-->
      <el-header class="header">
        <!-- 头部左边 -->
        <div id="left">
          <el-input
            class="header_left"
            placeholder="请输入搜索内容"
            prefix-icon="el-icon-search"
            v-model="input"
          >
          </el-input>
        </div>
        <!-- 头部中间 -->
        <div class="modlie">
          <ul class="ul">
            <div>
              <router-link to="/Index_home">
                <span
                  class="icon iconfont icon-home"
                  style="font-size: 25px;color: white;"
                ></span>
              </router-link>
            </div>
            <div>
              <router-link to="/search">
                <span
                  class="icon iconfont icon-resou"
                  style="font-size: 25px;color: white;"
                ></span>
              </router-link>
            </div>
            <div>
              <router-link to="/by_author">
                <span
                  class="icon iconfont icon-envelope"
                  style="font-size: 25px;color: white;"
                ></span>
              </router-link>
            </div>
            <div>
              <router-link to="/My_one">
                <span class="fa fa-user-o" style="font-size: 25px;color: white;"></span>
              </router-link>
            </div>
          </ul>
        </div>

        <!-- 头部右边-->
        <div>
          <ul class="ul">
            <li>
              <el-button
                type="info"
                round
                style="color: black; background-color:white"
                @click="goTo()"
              >
                登录
              </el-button>
            </li>
          </ul>
        </div>
      </el-header>

      <!-- 中间内容 style="background-color: rgb(240, 240, 240)"-->
      <el-main>
        <router-view />
      </el-main>
    </el-container>
  </div>
</template>

<script>
export default {
  name: "Home",
  data() {
    return {
      input: "",
    };
  },
  methods: {
    goTo() {
      //直接跳转
      this.$router.push("/login");
    },
  },
};
</script>

<style spoed>
* {
  list-style: none;
  /* background-color: rgb(240, 240, 240); */
}
/* 头部的样式 */
.header {
  display: flex;
  flex-direction: row;
  justify-content: space-around;
  list-style: none;
  background-color: red ;
}
.header_left {
  margin-top: 10px;
  /* border: rgb(238, 56, 56) 1px solid; */
}
.modlie {
  width: 450px;
  color: white;
  /* color: rgb(233, 232, 232); */
  /* border:black 1px solid; */
  
}

.ul {
  display: flex;
  flex-direction: row;
  justify-content: space-around;
  list-style: none;
  text-align: center;
}
.bt {
  margin-left: 10px;
}

.el-dropdown {
  vertical-align: top;
}
.el-dropdown + .el-dropdown {
  margin-left: 15px;
}
.router-link-active {
  text-decoration: none;
  color: orange;
}
</style>
