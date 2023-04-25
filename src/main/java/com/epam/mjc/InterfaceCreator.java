package com.epam.mjc;

import java.util.ArrayList;
import java.util.List;

public class InterfaceCreator {
    public Operation<Integer> divideBy(Integer divider) {
        return (List<Integer> inputList) -> {
            List<Integer> outputList = new ArrayList<>();
            for (Integer num : inputList) {
                outputList.add(num / divider);
            }
            return outputList;
        };
    }
}
