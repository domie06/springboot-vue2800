const base = {
    get() {
        return {
            url : "http://localhost:8080/qichekeyundingpiao/",
            name: "qichekeyundingpiao",
            // 退出到首页链接
            indexUrl: 'http://localhost:8080/qichekeyundingpiao/front/index.html'
        };
    },
    getProjectName(){
        return {
            projectName: "汽车客运订票系统"
        } 
    }
}
export default base
