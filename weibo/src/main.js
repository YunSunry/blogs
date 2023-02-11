import Vue from 'vue'
import App from './App.vue'
import router from './router'
import store from './store'
import ElementUI from 'element-ui';             //全局引入element
import 'element-ui/lib/theme-chalk/index.css';    //全局引入element的样式
import './assets/iconfont/iconfont.css';
import './assets/css/home.css';
import './assets/css/font-awesome.min.css';  // 导入 font awesome 图标
import moment from 'moment'  //时间格式化插件
Vue.prototype.$moment = moment;

import axios from 'axios'
import VueAxios from 'vue-axios'
import qs from 'qs';
Vue.prototype.qs = qs
Vue.prototype.$ajax = axios
Vue.config.productionTip = false

Vue.use(VueAxios,axios)
Vue.use(ElementUI);     //全局注入element

new Vue({
  router,
  store,
  render: h => h(App)
}).$mount('#app')
