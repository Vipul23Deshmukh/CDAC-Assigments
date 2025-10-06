import React, {useState } from "react";
import Themecontext from "./Themecontext";

const App1 = () => {
    const [theme, settheme] = useState("Light");

    const toggle = () =>
        settheme((prevTheme) => (prevTheme === "Light" ? "Dark" : "Light"));

    return (
        <Themecontext.Provider value={theme}>
        <div style={{ background: theme === "Light" ? "#faf8f8ff" : "#333", color: theme === "light" ? "#5a9b5fff" : "#ffffffff", padding: "20px" }}>Hello World</div>
           < button onClick={toggle}>Toggle Theme</button>
        </Themecontext.Provider>
    );
};

export default App1;