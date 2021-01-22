package com.fawvw.day12.Demo05;

import java.util.ArrayList;

public class OpenModeAvgImpl implements OpenMode {
    @Override
    public ArrayList<Integer> divide(final int totalMoney, final int totalCount) {
        ArrayList<Integer> list = new ArrayList<Integer>();

        int avg = totalMoney / totalCount;
        int mod = totalMoney % totalCount;

        for (int i = 0; i < totalCount - 1; i++) {
            list.add(avg);

        }
        list.add(avg + mod);
        return list;

    }
}
