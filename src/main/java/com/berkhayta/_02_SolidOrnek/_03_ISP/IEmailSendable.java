package com.berkhayta._02_SolidOrnek._03_ISP;

import com.berkhayta._02_SolidOrnek.Utility.User;

public interface IEmailSendable {
    void sendEmail(User user);
}
