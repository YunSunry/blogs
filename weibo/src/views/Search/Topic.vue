<template>
<div>
  <div class="topic" v-for="(item, index) in topic.topics" :key="index">
      <router-link :to="{ name: 'Details', query: { users: item.list_user } }"
        style="color:black;text-decoration:none;">
            <div class="title">
              <span>&nbsp;&nbsp;&nbsp;&nbsp;</span>
              <i class="icon iconfont icon-resou" style="font-size: 20px;color:red;"></i>
              {{ item.topic_title }}
            </div>
            <div class="context">{{ item.context }}</div>
            <div class="context2">
              阅读:&nbsp;&nbsp;{{ item.reader }}&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;讨论:&nbsp;&nbsp;{{
                item.discuss
              }}
            </div>
            
        </router-link>
    </div>
   
</div>
    
  
</template>

<script type="text/javascript">
import topic from "@/assets/json/topic.json";
export default {
  name: "Topic",
  data(){
    return{
      topic,
      filters: {
                //文字数超出时，超出部分使用...
                ellipsis(value) {
                    if (!value) return ''
                    if (value.length > 10) {
                        return value.slice(0, 10) + '...'
                    }
                    return value
                }
            }
            }
  },
  components: {},
};
</script>

<style scoped>
.topic {
  height: 100px;
  background-color: rgb(255, 255, 255);
  display: flex;
  flex-direction: row;
  justify-content: space-between;
  margin-top: 10px;
  border-radius: 5px;
  margin-right: 10px;
  /* border: black 1px solid;*/
} 

.title{
  font-size: 17px;
  font-weight:bolder;
  margin-top: 10px;
}
.context{
  color:gray;
  font-size: 14px;
  margin-left: 25px;
  margin-top: 8px;
}
.title:hover{
  color: orange;
}
.context2{
  color: gray;
  font-size: 12px;
  margin-left: 25px;
  margin-top: 7px;
}
.topic_left{
  display: flex;
  width: 100px;
  height: 100px;
  border: 1px black solid;
}

</style>