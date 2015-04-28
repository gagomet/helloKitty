package com.hellokitty.service.impl;

import com.google.common.base.Preconditions;
import com.google.common.collect.Ordering;
import com.hellokitty.service.GuavaService;
import org.springframework.stereotype.Service;

import java.util.Collections;
import java.util.List;

/**
 * Created by KAKolesnikov on 2015-04-28.
 */

@Service
public class GuavaServiceImpl implements GuavaService<Integer> {

    public int oddNumber(int number) {
        Preconditions.checkArgument(number % 2 != 0, "Number is even");
        return number;
    }

    @Override
    public String manipulateWithListOrder(List<Integer> list) {
        Ordering ordering = Ordering.natural();
        StringBuilder builder = new StringBuilder();
        builder.append("Entry list ").append(list.toString());
        builder.append("\n");
        Collections.sort(list, ordering);
        builder.append("Sorted asc list ").append(list.toString());
        return builder.toString();
    }


}
