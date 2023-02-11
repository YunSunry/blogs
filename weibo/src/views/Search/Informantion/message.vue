<template>
    <div>
        <div class="mian">
            <el-tabs v-model="activeName" @tab-click="handleClick" class="tabs_v">
                 <el-tab-pane label="收到的评论" name="first">
                    <el-empty :image-size="300"></el-empty>
                </el-tab-pane>
                <el-tab-pane label="关注人的评论" name="second">
                    <el-empty :image-size="300"></el-empty>
                </el-tab-pane>
                <el-tab-pane label="发出的评论" name="third">
                    <el-empty :image-size="300"></el-empty>
                </el-tab-pane>
               
              </el-tabs>

          </div>
    </div>
    
</template>

<script type="text/javascript">

export default {
    name:"Message",
    components:{},
    data() {
        return {
            activeName: 'first',
          
            
        };
    },
    
    methods: {
        handleClick(tab, event) {
        console.log(tab, event);
      }
    },
    
}
</script>

<style scoped>


 
</style>