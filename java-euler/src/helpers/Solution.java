package helpers;


import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public abstract class Solution {

    private final int number;
    public ArrayList<Method> solutionList = new ArrayList<Method>();

    public Solution(int number) {
        this.number = number;
        var stream = Arrays.stream(this.getClass().getDeclaredMethods());
        var filteredMethods = stream.filter(method -> method.isAnnotationPresent(Anno1.class)).toList();
        this.solutionList.addAll(filteredMethods);
        var d = this.solutionList.get(0);
    }

    @Override
    public String toString() {
        return "Problem %1$s".formatted(this.number);
    }

    public void runAll() {
        for (var method : this.solutionList) {
//            method.invoke();
        }
    }
}
