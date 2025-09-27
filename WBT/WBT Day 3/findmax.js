
//using foreach
let arr=[3,4,2,8,6,9];

  let largest=arr[0];
    arr.forEach(element=>{
        if(element>largest)
        {
          largest=element;
        }
    })
    console.log("largest = ",largest)

//using for


function largestElement(arr) {
    let largestNum = arr[0];
    for (let i = 1; i < arr.length; i++) {
        if (arr[i] > largestNum) {
            largestNum = arr[i];
        }
    }
    return largestNum;
}

const num1 = [10, 15, 18, 20, 23];
const result = largestElement(num1);

console.log("The largest element in the array is:" + result);


//using sort

function findlarge(ar)
{
     ar.sort((a,b) => a-b);

     return ar[ar.length-1];
}

let ar=[5,4,3,2,1];
console.log(" largest element of an array : ",findlarge(ar));

