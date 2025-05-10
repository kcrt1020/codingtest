// https://programmers.co.kr/learn/courses/30/lessons/1845

function solution(nums) {
    var answer = 0;
    var select = (nums.length)/2;
    var sort = [...new Set(nums)].length;

    return answer = sort>select?select:sort;
}