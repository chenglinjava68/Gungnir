package io.github.chinalhr.gungnir_rpc.filter;

import io.github.chinalhr.gungnir_rpc.filter.impl.ProviderLimitFilter;
import io.github.chinalhr.gungnir_rpc.filter.impl.ProviderListenerFilter;

import java.util.ArrayList;
import java.util.List;

/**
 * @Author : ChinaLHR
 * @Date : Create in 17:41 2018/5/24
 * @Email : 13435500980@163.com
 */
public class GungnirFilterManager {
    private static List<ProviderFilter> gungnirFilterList = new ArrayList<>();

    static {
        gungnirFilterList.add(ProviderLimitFilter.of());
        gungnirFilterList.add(ProviderListenerFilter.of());
    }

    public static List<ProviderFilter> getGungnirFilterList() {
        return gungnirFilterList;
    }
}
