package com.socialcdeIntellij.object;

import javax.script.Bindings;
import javax.script.ScriptContext;
import javax.script.ScriptEngine;
import javax.script.ScriptEngineManager;

public class JS {
    public static void main(String args[]) throws Exception {
        ScriptEngine js = new ScriptEngineManager().getEngineByName("javascript");
       // Bindings bindings = js.getBindings(ScriptContext.ENGINE_SCOPE);

       // bindings.put("CurrentUrl", );
        //js.eval("print (window.location.href);");
        js.eval("var newURL = window.location.protocol + " +
                "\"://\" + window.location.host + \"/\" + window.location.pathname;");
        js.eval("print(newURL);");
    }
}
