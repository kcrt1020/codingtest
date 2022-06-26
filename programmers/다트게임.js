// https://programmers.co.kr/learn/courses/30/lessons/17682

function solution(dartResult) {
    var dr = [];
    var num = '1234567890';
    var bon = 'SDT';
    var opt = '*#';

    for (var i = 0; i < 3; i++) {
        for (var j = 2; j < 4; j++) {
            if (num.includes(dartResult[j])) {
                dr.push(dartResult.slice(0, j));
                dartResult = dartResult.replace(dartResult.slice(0, j),'');
                break;
            }
        }
      }
     dr.push(dartResult);

     for (var i = 0; i < 3; i++) {
        var dart = [];
        for (var j = dr[i].length - 1; j >= 0; j--) {
            if (opt.includes(dr[i][j])) {
                dart[2] = dr[i][j];
            } else if (bon.includes(dr[i][j])) {
                dart[1] = dr[i][j];
            } else {
                    if(dr[i][j] == 0){
                        dart[0] = parseInt(dr[i].slice(0, 2));
                    } else {
                        dart[0] = parseInt(dr[i].slice(0, j + 1));

                }
                break;
            }
        }
        dr[i] = dart;
    }

    for (let i = 0; i < 3; i++) {
        if (dr[i][1] === 'D') {
            dr[i][0] **= 2;
        } else if (dr[i][1] === 'T') {
            dr[i][0] **= 3;
        }

        if (dr[i][2] === '#') {
            dr[i][0] *= -1;
        } else if (dr[i][2] === '*') {
            dr[i][0] *= 2;
            if (i > 0) {
                dr[i - 1][0] *= 2;
            }
        }
    }

   return dr[0][0] + dr[1][0] + dr[2][0];
}