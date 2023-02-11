<template>
  <div class="inner">
    <div class="search_card" v-for="(item, index) in search.searches" :key="index" @click="selectItem(item)">
      <router-link :to="{name:'Host',query:{users: item.introduction}}" style="color:black;text-decoration: none;">
        
          <div class="title">
            <i style="color:red; font-size: 18px;">{{item.id}}</i>&nbsp;&nbsp;&nbsp;
            {{item.title}} 
          </div>

          <div class="context">
            热度值：&nbsp;&nbsp;{{item.host}}
          </div>
  
     
            
      </router-link>
      </div>
  </div>
</template>

<script type="text/javascript">
import search from "@/assets/json/search.json";
export default {
  name: "Billboard",
  data() {
    return {
      search,
    }
  },
  components: {},
};
</script>

<style scoped>
.search{
  font-size: 20px;

}
.search_card{
  width: 100%;
  height: 70px;
  background-color: rgb(255, 255, 255);
  display: flex;
  flex-direction: row;
  margin-top: 10px;
  border-radius: 5px;
  margin-right: 10px;
  margin-left: 10px;
}
.title{
  font-size: 17px;
  font-weight:bolder;
  margin-left: 10px;
  margin-top: 13px;
}
.title:hover{
  color: orange;
}
.context{
  color:gray;
  font-size: 13px;
  margin-left: 14px;
  margin-top: 3px;
 
}
</style>