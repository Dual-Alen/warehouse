(function(e){function t(t){for(var o,l,i=t[0],s=t[1],u=t[2],p=0,d=[];p<i.length;p++)l=i[p],Object.prototype.hasOwnProperty.call(n,l)&&n[l]&&d.push(n[l][0]),n[l]=0;for(o in s)Object.prototype.hasOwnProperty.call(s,o)&&(e[o]=s[o]);c&&c(t);while(d.length)d.shift()();return a.push.apply(a,u||[]),r()}function r(){for(var e,t=0;t<a.length;t++){for(var r=a[t],o=!0,i=1;i<r.length;i++){var s=r[i];0!==n[s]&&(o=!1)}o&&(a.splice(t--,1),e=l(l.s=r[0]))}return e}var o={},n={app:0},a=[];function l(t){if(o[t])return o[t].exports;var r=o[t]={i:t,l:!1,exports:{}};return e[t].call(r.exports,r,r.exports,l),r.l=!0,r.exports}l.m=e,l.c=o,l.d=function(e,t,r){l.o(e,t)||Object.defineProperty(e,t,{enumerable:!0,get:r})},l.r=function(e){"undefined"!==typeof Symbol&&Symbol.toStringTag&&Object.defineProperty(e,Symbol.toStringTag,{value:"Module"}),Object.defineProperty(e,"__esModule",{value:!0})},l.t=function(e,t){if(1&t&&(e=l(e)),8&t)return e;if(4&t&&"object"===typeof e&&e&&e.__esModule)return e;var r=Object.create(null);if(l.r(r),Object.defineProperty(r,"default",{enumerable:!0,value:e}),2&t&&"string"!=typeof e)for(var o in e)l.d(r,o,function(t){return e[t]}.bind(null,o));return r},l.n=function(e){var t=e&&e.__esModule?function(){return e["default"]}:function(){return e};return l.d(t,"a",t),t},l.o=function(e,t){return Object.prototype.hasOwnProperty.call(e,t)},l.p="/";var i=window["webpackJsonp"]=window["webpackJsonp"]||[],s=i.push.bind(i);i.push=t,i=i.slice();for(var u=0;u<i.length;u++)t(i[u]);var c=s;a.push([0,"chunk-vendors"]),r()})({0:function(e,t,r){e.exports=r("56d7")},"034f":function(e,t,r){"use strict";r("85ec")},"039a":function(e,t,r){"use strict";r("7174")},"56d7":function(e,t,r){"use strict";r.r(t);r("e260"),r("e6cf"),r("cca6"),r("a79d");var o=r("2b0e"),n=function(){var e=this,t=e.$createElement,r=e._self._c||t;return r("div",{attrs:{id:"app"}},[r("router-view")],1)},a=[],l={name:"App",components:{}},i=l,s=(r("034f"),r("2877")),u=Object(s["a"])(i,n,a,!1,null,null,null),c=u.exports,p=r("5c96"),d=r.n(p),f=(r("0fae"),r("8c4f")),m=function(){var e=this,t=e.$createElement,r=e._self._c||t;return r("body",{attrs:{id:"paper"}},[r("el-form",{directives:[{name:"loading",rawName:"v-loading",value:e.loading,expression:"loading"}],staticClass:"login-container",attrs:{model:e.loginForm,rules:e.rules,"label-position":"left","label-width":"0px"}},[r("h3",{staticClass:"login_title"},[e._v("服装类销售企业仓库管理系统登录")]),r("el-form-item",{attrs:{prop:"username"}},[r("el-input",{attrs:{type:"text","auto-complete":"off",placeholder:"账号"},model:{value:e.loginForm.username,callback:function(t){e.$set(e.loginForm,"username",t)},expression:"loginForm.username"}})],1),r("el-form-item",{attrs:{prop:"password"}},[r("el-input",{attrs:{type:"password","auto-complete":"off",placeholder:"密码"},model:{value:e.loginForm.password,callback:function(t){e.$set(e.loginForm,"password",t)},expression:"loginForm.password"}})],1),r("el-checkbox",{staticClass:"login_remember",attrs:{"label-position":"left"},model:{value:e.checked,callback:function(t){e.checked=t},expression:"checked"}},[r("span",{staticStyle:{color:"#505458"}},[e._v("记住密码")])]),r("el-form-item",{staticStyle:{width:"100%"}},[r("el-button",{staticStyle:{width:"40%",background:"#505458",border:"none"},attrs:{type:"primary"},on:{click:e.login}},[e._v("登录")])],1)],1)],1)},h=[],g=(r("ac1f"),r("5319"),{data:function(){return{rules:{username:[{required:!0,message:"用户名不能为空",trigger:"blur"}],password:[{required:!0,message:"密码不能为空",trigger:"blur"}]},checked:!0,loginForm:{username:"",password:""},loading:!1}},methods:{login:function(){var e=this,t=this;this.$axios.post("/login",{username:this.loginForm.username,password:this.loginForm.password}).then((function(r){if(200===r.data.code){var o=r.data.result;t.$store.commit("login",o);var n=t.$route.query.redirect;t.$router.replace({path:"/"===n||void 0===n?"/admin/dashboard":n})}else e.$alert(r.data.message,"提示",{confirmButtonText:"确定"})})).catch((function(e){}))}}}),b=g,v=(r("039a"),Object(s["a"])(b,m,h,!1,null,null,null)),y=v.exports,w=r("bc3a");w.defaults.baseURL="http://localhost:8443/api",o["default"].prototype.$axios=w,o["default"].use(d.a),o["default"].use(f["a"]);var x=[{path:"/",component:y},{path:"*",redirect:"/"}],_=new f["a"]({routes:x,mode:"history"});o["default"].config.productionTip=!1,new o["default"]({el:"#app",router:_,render:function(e){return e(c)},components:{App:c},template:"<App/>"}).$mount("#app")},7174:function(e,t,r){},"85ec":function(e,t,r){}});
//# sourceMappingURL=app.78655945.js.map