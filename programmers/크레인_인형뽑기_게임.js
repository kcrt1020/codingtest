// https://programmers.co.kr/learn/courses/30/lessons/64061

function solution(board, moves) {
    let result = 0;
    let temp = 0;
    let basket = [];
    console.log(board);
    for(let i = 0; i < moves.length; i++) {
        for(let j = 0; j < board.length; j++) {
            if(board[j][moves[i]-1] !== 0) {
                if (temp === board[j][moves[i]-1]) {
                    result += 2;
                    if(basket.length > 0) {
                        basket.pop();
                        temp = basket[basket.length-1];
                        console.log(temp);
                    } else {
                        temp = 0;
                    }
                } else {
                    basket.push(board[j][moves[i]-1]);
                    temp = board[j][moves[i]-1];
                }
                board[j][moves[i]-1] = 0;
                break;
            }
        }
    }

    return result;
}