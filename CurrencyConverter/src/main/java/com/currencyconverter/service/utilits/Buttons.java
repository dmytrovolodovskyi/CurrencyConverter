package com.currencyconverter.service.utilits;

import org.telegram.telegrambots.meta.api.objects.replykeyboard.InlineKeyboardMarkup;

import static com.currencyconverter.service.utilits.ui.UserServices.getUserSettingsById;

public class Buttons {

    public static InlineKeyboardMarkup time(long chatId) {
        return InlineKeyboardMarkupBuilder.buildMarkup(
                new String[]{
                        getUserSettingsById(chatId).getTime().equals("09:00") ? "✅ 09:00" : "09:00",
                        getUserSettingsById(chatId).getTime().equals("10:00") ? "✅ 10:00" : "10:00",
                        getUserSettingsById(chatId).getTime().equals("11:00") ? "✅ 11:00" : "11:00",
                        getUserSettingsById(chatId).getTime().equals("12:00") ? "✅ 12:00" : "12:00",
                        getUserSettingsById(chatId).getTime().equals("13:00") ? "✅ 13:00" : "13:00",
                        getUserSettingsById(chatId).getTime().equals("14:00") ? "✅ 14:00" : "14:00",
                        getUserSettingsById(chatId).getTime().equals("15:00") ? "✅ 15:00" : "15:00",
                        getUserSettingsById(chatId).getTime().equals("16:00") ? "✅ 16:00" : "16:00",
                        getUserSettingsById(chatId).getTime().equals("17:00") ? "✅ 17:00" : "17:00",
                        getUserSettingsById(chatId).getTime().equals("18:00") ? "✅ 18:00" : "18:00",
                        getUserSettingsById(chatId).getTime().equals("Turn off notifications") ?
                                "✅ Turn off notifications" : "Turn off notifications",
                        "\uD83D\uDD19 Back"
                });
    }

    public static InlineKeyboardMarkup bank(long chatId) {
        return InlineKeyboardMarkupBuilder.buildMarkup(
                new String[]{
                        getUserSettingsById(chatId).getBank().equals("NBU") ? "✅ NBU" : "NBU",
                        getUserSettingsById(chatId).getBank().equals("Privat") ? "✅ Privat" : "Privat",
                        getUserSettingsById(chatId).getBank().equals("Mono") ? "✅ Mono" : "Mono",
                        "\uD83D\uDD19 Back"
                });
    }

    public static InlineKeyboardMarkup currency(long chatId) {
        return InlineKeyboardMarkupBuilder.buildMarkup(
                new String[]{
                        getUserSettingsById(chatId).getCurrency().equals("USD") ? "✅ USD" : "USD",
                        getUserSettingsById(chatId).getCurrency().equals("EUR") ? "✅ EUR" : "EUR",
                        "\uD83D\uDD19 Back"
                });
    }

    public static InlineKeyboardMarkup number(long chatId) {
        return InlineKeyboardMarkupBuilder.buildMarkup(
                new String[]{
                        getUserSettingsById(chatId).getNumber().equals("2") ? "✅ 2" : "2",
                        getUserSettingsById(chatId).getNumber().equals("3") ? "✅ 3" : "3",
                        getUserSettingsById(chatId).getNumber().equals("4") ? "✅ 4" : "4",
                        "\uD83D\uDD19 Back"
                });
    }

    public static InlineKeyboardMarkup setting() {
        return InlineKeyboardMarkupBuilder.buildMarkup(
                new String[]{
                        "\uD83C\uDFE6 Bank", "\uD83D\uDCB5 Currency", "\uD83D\uDD52 Notification time",
                        "\uD83D\uDD22 Number of decimal places", "\uD83C\uDFE0 To the main page"
                });
    }

    public static InlineKeyboardMarkup info() {
        return InlineKeyboardMarkupBuilder.buildMarkup(
                new String[]{"⚙ Settings"});
    }

    public static InlineKeyboardMarkup start() {
        return InlineKeyboardMarkupBuilder.buildMarkup(
                new String[]{"\uD83D\uDCB1 Get info", "⚙ Settings"});
    }
}
