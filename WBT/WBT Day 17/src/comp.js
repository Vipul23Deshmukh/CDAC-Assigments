import React from "react";

export function Header(){
     return <h1>welcome to my new app</h1>
}

export function Footer(){
    return <h2>made by the IET Students</h2>
}

export function Greeting({Students}){
    return <p>hello,{Students} good morning</p>

}