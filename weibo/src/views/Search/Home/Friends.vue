<template>
    <div>
        <div class="publish">
         
            <div class="P_text">
              <textarea placeholder="有什么新鲜事要分享给大家？" class="p_text">
         
              </textarea>
            </div> 
            <div>
              <el-button class="my_button_1" type="warning" plain >发布</el-button>
            </div>
        </div>
  
        <el-empty :image-size="300"></el-empty>

    </div>
</template>

<script style="text/javascript">

export default{
    name:"Friends",
    components:{}

}

</script>

<style scoped>
.publish{
    width: 100%;
    height: 150px;
    background-color: white;
    margin-bottom: 10px;
    border-radius: 5px;
  }
  .p_text{
    margin-top: 30px;
    width: 90%;
    margin-left: 5%;
    background-color:white;
    border: 3px 3px 3px 3px gainsboro;
    border-radius: 5px;
    outline-color:orange; 
    text-indent: 10px;
    line-height: 30px
    

  }
  .my_button_1{
    color: orange;
    background:white;
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
  .P_text{
    display: flex;
  }


</style>