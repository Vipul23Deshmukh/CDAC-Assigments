function calculate(...a) {

    console.log("the value of a are:",a);

    let sum =0;
    for(let i =0;i<a.length;i++){
        sum=sum+a[i];
    }
    console.log("The sum is",sum);


    for(let i=0;i<a.length;i++){

        if(a[i]%2!=0){
            console.log(a[i]);
        }
    }

}

calculate(1,3,5,4,8,10);

calculate(100,23,45,23,67,88,6,777,2);
calculate(1,2,34,5,6,7,8);