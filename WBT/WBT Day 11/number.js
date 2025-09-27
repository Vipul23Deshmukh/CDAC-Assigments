for (let i = 0; i < 100; i++) {

    if (i % 3 == 0 && i % 5 == 0)
    {
        console.log(i);
        console.log("footbar");
    }

    else if (i % 3 == 0) {
        console.log(i);
        console.log("foo");
    }
    else if (i % 5 == 0)
    {
        console.log(i);
        console.log("Bar");

    }

    else{
        console.log(i);
    }
     
}