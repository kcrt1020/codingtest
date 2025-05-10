// https://programmers.co.kr/learn/courses/30/lessons/92334

function solution(id_list, report, k) {
    var answer = [];
    answer = new Array(id_list.length);
    answer.fill(0);

    var ban = {};
    id_list.map((id)=>{
        ban[id] = []
    })

    report.map((id)=>{
        var [user_id, report_id] = id.split(' ')
        if(!ban[report_id].includes(user_id)){
            ban[report_id].push(user_id)
        }
    })

    for(var key in ban){
        if(ban[key].length >= k){
            ban[key].map((id)=>{
                answer[id_list.indexOf(id)] += 1
            })
        }
    }
    return answer;
}