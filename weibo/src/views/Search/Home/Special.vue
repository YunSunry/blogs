<template>
  <div>
    <div class="publish">
      <div class="P_text">
        <textarea
          placeholder="有什么新鲜事要分享给大家？"
          :rows="2"
          class="p_text"
        >
        </textarea>
      </div>
      <div>
        <el-button class="my_button_1" type="warning" plain>发布</el-button>
      </div>
    </div>
    <!-- <div>
        <input type="file" id="input-upload-file" ref="selectFiles" multiple="multiple">
    <el-button class="operation-button-select" @click="handleButtonSelected">选择文件（可多选）</el-button>

    </div> -->

    <el-empty :image-size="300"></el-empty>
    <!-- <div class="container">
        <button @click="isActive = !isActive">展开/折叠</button>
        <collapse>
            <div v-show="isActive">
                <div style="border:1px solid #ddd;padding:10px;">
                <h2>欢迎大家品尝Pizza!</h2>
                <h5>这里有你非常喜欢的Pizza!</h5>
                </div>
            </div>
        </collapse>
        <div>
            666
        </div>
    </div> -->





  </div>
</template>

<script style="text/javascript">

import collapse from "@/assets/js/collapse.js";
export default {
  name: "Special",

  data() {
    return {
      isActive: false
    };
  },
  components: {
    collapse
  }

  // methods: {
  //           // 按钮点击事件
  //           handleButtonSelected() {
  //               // 主动触发点击事件
  //           this.$refs.selectFiles.dispatchEvent(new MouseEvent('click'));   
  //           },
  //       }
};
</script>

<style scoped>
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

 .el-dropdown {
    vertical-align: top;
  }
  .el-dropdown + .el-dropdown {
    margin-left: 15px;
  }
</style>