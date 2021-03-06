package io.github.chinalhr.provider1.filter;

import io.github.chinalhr.gungnir_rpc.annonation.GFilter;
import io.github.chinalhr.gungnir_rpc.filter.FilterInvoker;
import io.github.chinalhr.gungnir_rpc.filter.ProviderFilter;
import io.github.chinalhr.gungnir_rpc.protocol.GRequest;
import io.github.chinalhr.gungnir_rpc.protocol.GResponse;

/**
 * @Author : ChinaLHR
 * @Date : Create in 21:34 2018/5/25
 * @Email : 13435500980@163.com
 */
@GFilter(order = 100)
public class ProviderFilterOrder100 implements ProviderFilter {

    @Override
    public GResponse invoke(FilterInvoker filterInvoker, GRequest gRequest) {
        System.out.println("Filter======100=========");
        return filterInvoker.invoker(gRequest);
    }
}
