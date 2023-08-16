package com.currencyconverter.service.utilits.commands;

import org.telegram.telegrambots.meta.api.objects.commands.BotCommand;

import java.util.ArrayList;
import java.util.List;

public class BotCommandListMenu {

    public static List<BotCommand> getBotCommandList() {
        List<BotCommand> botCommandList = new ArrayList<>();
        botCommandList.add(new BotCommand("/start", "Start the bot"));
        botCommandList.add(new BotCommand("/info", "Get info"));
        botCommandList.add(new BotCommand("/setting", "Settings"));
        botCommandList.add(new BotCommand("/bank", "Bank settings"));
        botCommandList.add(new BotCommand("/currency", "Currency settings"));
        botCommandList.add(new BotCommand("/time", "Notification settings"));
        botCommandList.add(new BotCommand("/number", "Setting up signs"));

        return botCommandList;
    }
}
