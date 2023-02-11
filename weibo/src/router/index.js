import Vue from 'vue'
import VueRouter from 'vue-router'

Vue.use(VueRouter)

const routes = [
  {
    path: "/",
    // name: 'home',
    component: () => import('../views/Home.vue'),
    children: [
      {
        path: '/',
        name: 'Index',
        component: () => import('@/views/Index.vue'),
        children: [
          {
            path: '/weibo',
            name: 'Weibo',
            component: () => import('../views/Search/Weibo.vue'),
          },
          {
            path: '/search',
            name: 'Search',
            component: () => import('../views/Search/Search.vue'),
          },
          {
            path: '/topic',
            name: 'Topic',
            component: () => import('../views/Search/Topic.vue'),
         
          },
          {
            path: '/billboard',
            name: 'Billboard',
            component: () => import('../views/Search/Billboard.vue'),
          },
        ]
      },
      {
        path: '/search',
        name: 'Search',
        component: () => import('@/views/Search/Search.vue'),
      },
      {
        path: '/informantion',
        name: 'Informantion',
        component: () => import('@/views/Informantion.vue'),
        children: [
          {
            path: '/by_author',
            name: 'Byauthor',
            component: () => import('../views/Search/Informantion/by_author.vue'),
          },
          {
            path: '/message',
            name: 'Message',
            component: () => import('../views/Search/Informantion/message.vue')
          },
          {
            path: '/support',
            name: 'Support',
            component: () => import('../views/Search/Informantion/support.vue')
          }
        ]
      },
      {
        path: '/my',
        name: 'My',
        component: () => import('@/views/My.vue'),
        children: [
          {
            path: '/myself',
            name: 'Myself',
            component: () => import('../views/Search/My/Myself.vue'),
          },
          {
            path: '/my_one',
            name: 'My_one',
            component: () => import('../views/Search/My/My_one.vue'),
          },
          {
            path: '/my_wb',
            name: 'My_wb',
            component: () => import('../views/Search/My/My_wb.vue'),
          },

          
        ]
      },
      {
        path: '/home_index',
        name: 'Home_index',
        component: () => import('@/views/Home_index.vue'),
        children: [
          {
            path: '/index_home',
            name: 'Index_home',
            component: () => import('../views/Search/Home/Index_home.vue'),
          },
          {
            path: '/attention',
            name: 'Attention',
            component: () => import('../views/Search/Home/Attention.vue'),
          },
          {
            path: '/friends',
            name: 'Friends',
            component: () => import('../views/Search/Home/Friends.vue'),
          },
          {
            path: '/special',
            name: 'Special',
            component: () => import('../views/Search/Home/Special.vue')
          },
          {
            path: '/Comment',
            name: 'Comment',
            component: () => import('../views/Search/Home/Comment.vue')
          }

        ]
      },
      {
        path: '/host',
        name: 'Host',
        component: () => import('../views/Host.vue'),
        children: [
          {
            path: '/topic_details',
            name: 'Topic_details',
            component: () => import('../views/Search/Topic/Topic_details.vue')
          },
        ]
      },
      {
        path: '/login',
        name: 'Login',
        component: () => import('../views/Search/Login/login.vue'),
      },
    ]

  },

]

const router = new VueRouter({
  mode: 'history',
  base: process.env.BASE_URL,
  routes
})

export default router
