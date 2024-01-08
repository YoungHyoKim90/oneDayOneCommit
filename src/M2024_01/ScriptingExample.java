package M2024_01;

import javax.script.ScriptEngine;
import javax.script.ScriptEngineManager;
import javax.script.ScriptException;

public class ScriptingExample {
    public static void main(String[] args) {
        ScriptEngineManager manager = new ScriptEngineManager();
        ScriptEngine engine = manager.getEngineByName("JavaScript");

        try {
            // JavaScript로 간단한 연산을 실행해봅니다.
            Object result = engine.eval("1 + 2 * 3");
            System.out.println("Result: " + result); // 출력: Result: 7
        } catch (ScriptException e) {
            e.printStackTrace();
        }
    }
}

