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

    for(let i=0;i<a.length;i++)
    {
        
    }
const largest=Math.max(...a);
    console.log(" Largest number = ",largest)

}
calculate(2,3,5,7,9,77);