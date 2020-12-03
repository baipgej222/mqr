package com.molicloud.mqr.plugin.core;

/**
 * 插件执行器接口
 *
 * @author feitao yyimba@qq.com
 * @since 2020/11/4 7:11 下午
 */
public interface PluginExecutor {

    /**
     * 获取插件的脚本
     */
    PluginInfo getPluginInfo();
}