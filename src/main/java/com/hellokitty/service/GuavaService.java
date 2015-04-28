package com.hellokitty.service;

import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by KAKolesnikov on 2015-04-28.
 */
@Service
public interface GuavaService<T> {
    public int oddNumber(int number);
    public String manipulateWithList(List<T> list);
}
