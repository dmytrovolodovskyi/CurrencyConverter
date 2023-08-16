package com.currencyconverter.service.utilits;

import com.currencyconverter.service.TelegramBot;
import com.currencyconverter.service.utilits.commands.BotCommands;

public class ProcessHandler {

    private final BotCommands botCommands;

    public ProcessHandler(TelegramBot telegramBot) {
        this.botCommands = new BotCommands(telegramBot);
    }

    public void message(String messageText, String username, long chatId) {
        switch (messageText) {
            case "/start" -> botCommands.start(chatId);
            case "/info" -> botCommands.infoMessage(chatId);
            case "/setting" -> botCommands.settingsMessage(chatId);
            case "/bank" -> botCommands.bankSettings(chatId);
            case "/currency" -> botCommands.currencySettings(chatId);
            case "/time" -> botCommands.timeSettings(chatId);
            case "/number" -> botCommands.numberSettings(chatId);
        }

        Log.Info(username, messageText);
    }

    public void callbackQuery(String callbackData, String userName, long chatIdBackQuery, long messageId) {
        switch (callbackData) {
            case "\uD83D\uDCB1 GET INFO" -> botCommands.infoMessage(chatIdBackQuery);
            case "⚙ SETTINGS", "\uD83D\uDD19 BACK" -> botCommands.settingsMessage(chatIdBackQuery);
            case "\uD83D\uDD22 NUMBER OF DECIMAL PLACES" -> botCommands.numberSettings(chatIdBackQuery);
            case "\uD83D\uDCB5 CURRENCY" -> botCommands.currencySettings(chatIdBackQuery);
            case "\uD83C\uDFE6 BANK" -> botCommands.bankSettings(chatIdBackQuery);
            case "\uD83D\uDD52 NOTIFICATION TIME" -> botCommands.timeSettings(chatIdBackQuery);
            case "PRIVAT" -> botCommands.setPrivat(chatIdBackQuery, messageId);
            case "MONO" -> botCommands.setMono(chatIdBackQuery, messageId);
            case "NBU" -> botCommands.setNBU(chatIdBackQuery, messageId);
            case "USD" -> botCommands.setUSD(chatIdBackQuery, messageId);
            case "EUR" -> botCommands.setEUR(chatIdBackQuery, messageId);
            case "2" -> botCommands.setTwoNumbers(chatIdBackQuery, messageId);
            case "3" -> botCommands.setThreeNumbers(chatIdBackQuery, messageId);
            case "4" -> botCommands.setFourNumbers(chatIdBackQuery, messageId);
            case "09:00" -> botCommands.setTime9(chatIdBackQuery, messageId);
            case "10:00" -> botCommands.setTime10(chatIdBackQuery, messageId);
            case "11:00" -> botCommands.setTime11(chatIdBackQuery, messageId);
            case "12:00" -> botCommands.setTime12(chatIdBackQuery, messageId);
            case "13:00" -> botCommands.setTime13(chatIdBackQuery, messageId);
            case "14:00" -> botCommands.setTime14(chatIdBackQuery, messageId);
            case "15:00" -> botCommands.setTime15(chatIdBackQuery, messageId);
            case "16:00" -> botCommands.setTime16(chatIdBackQuery, messageId);
            case "17:00" -> botCommands.setTime17(chatIdBackQuery, messageId);
            case "18:00" -> botCommands.setTime18(chatIdBackQuery, messageId);
            case "TURN OFF NOTIFICATIONS" -> botCommands.setTimeOff(chatIdBackQuery, messageId);
            case "\uD83C\uDFE0 TO THE MAIN PAGE" -> botCommands.home(chatIdBackQuery);
        }

        Log.button( userName, callbackData);
    }
}
