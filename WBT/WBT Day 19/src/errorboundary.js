import { render } from "@testing-library/react";
import { Component } from "react";

class ErrorBoundary extends Component{

    constructor(props){
        super(props);

        this.state={haserror:false};
    }

    static getDerivefromerror(){
   return {haserror:true};
    }

    componentDidCatch(error ,errorinfo){}



    
render(){

    if(this.state.haserror){
        return <h1>Something went wrong</h1>;
    }

    return this.props.children;
}
}



export default ErrorBoundary;