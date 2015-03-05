package com.socialcdeIntellij.object;

import com.intellij.util.ui.UIUtil;

import javax.imageio.ImageIO;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.IOException;
import java.net.URL;

/**
 * Created by Teo on 04/03/2015.
 */
public class ImagesMod {

    //ImageIcon image = new ImageIcon(getClass().getResource("/pkimg/dado.png"));//package interno e non esterno com ora
    //images/
    private final URL PATH_BALOON = this.getClass().getClassLoader().getResource("images/Baloon.png");
    private final URL PATH_DEFAULT_AVATAR = this.getClass().getClassLoader().getResource("images/DefaultAvatar.png");
    private final URL PATH_FOLLOW = this.getClass().getClassLoader().getResource("images/Toolbar/Follow.png");
    private final URL PATH_HIDE = this.getClass().getClassLoader().getResource("images/Toolbar/Hide.png");
    private final URL PATH_NO_ICON = this.getClass().getClassLoader().getResource("images/no_icon.png");
    private final URL PATH_SEND_MESSAGE = this.getClass().getClassLoader().getResource("images/send_message.png");
    private final URL PATH_SETTINGS = this.getClass().getClassLoader().getResource("images/settings.png");
    private final URL PATH_SKILLS = this.getClass().getClassLoader().getResource("images/skills.png");
    private final URL PATH_UNFOLLOW = this.getClass().getClassLoader().getResource("images/Unfollow.png");
    private final URL PATH_WALLPAPER = this.getClass().getClassLoader().getResource("images/Wallpaper.png");
    private final URL PATH_YES_ICON = this.getClass().getClassLoader().getResource("images/yes_icon.png");

    //image/Toolbar/
    private final URL PATH_BACK = this.getClass().getClassLoader().getResource("images/Toolbar/Back.png");
    private final URL PATH_HOME = this.getClass().getClassLoader().getResource("images/Toolbar/Home.png");
    private final URL PATH_INTERACTIVE_TIMELINE = this.getClass().getClassLoader().getResource("images/Toolbar/InteractiveTimeline.png");
    private final URL PATH_ITERACTION_TIMELINE = this.getClass().getClassLoader().getResource("images/Toolbar/IterationTimeline.png");
    private final URL PATH_LOGOUT = this.getClass().getClassLoader().getResource("images/Toolbar/Logout.png");
    private final URL PATH_NEXT = this.getClass().getClassLoader().getResource("images/Toolbar/Next.png");
    private final URL PATH_PEOPLE = this.getClass().getClassLoader().getResource("images/Toolbar/People.png");
    private final URL PATH_PROFILE = this.getClass().getClassLoader().getResource("images/Toolbar/Profile.png");

    public BufferedImage resize(BufferedImage originalImage, int width, int height) throws IOException {
        int type = originalImage.getType();
        BufferedImage resizedImage = UIUtil.createImage(width, height, type);//;new BufferedImage(width,height,type);
        Graphics2D g = resizedImage.createGraphics();
        g.drawImage(originalImage, 0, 0, width, height, null);
        g.dispose();
        return resizedImage;
    }//ridimensione immagine

    public Image get_ImageStream(URL stream) throws IOException {
        Image image = ImageIO.read(stream);
        return image;
    }//prende immagine da stream

    public Image getBALOON(int width, int height) throws IOException {
        return resize((BufferedImage)get_ImageStream(PATH_BALOON), width, height);
    }

    public Image getDEFAULT_AVATAR(int width, int height) throws IOException {
        return resize((BufferedImage)get_ImageStream(PATH_DEFAULT_AVATAR), width, height);
    }

    public Image getFOLLOW(int width, int height) throws IOException{
        return resize((BufferedImage)get_ImageStream(PATH_FOLLOW), width, height);
    }

    public Image getHIDE(int width, int height) throws IOException{
        return resize((BufferedImage)get_ImageStream(PATH_HIDE), width, height);
    }

    public Image getNO_ICON(int width, int height) throws IOException{
        return resize((BufferedImage)get_ImageStream(PATH_NO_ICON), width, height);
    }

    public Image getSEND_MESSAGE(int width, int height) throws IOException{
        return resize((BufferedImage)get_ImageStream(PATH_SEND_MESSAGE), width, height);
    }

    public Image getSETTINGS(int width, int height) throws IOException{
        return resize((BufferedImage)get_ImageStream(PATH_SETTINGS), width, height);
    }

    public Image getSKILLS(int width, int height) throws IOException{
        return resize((BufferedImage)get_ImageStream(PATH_SKILLS), width, height);
    }

    public Image getUNFOLLOW(int width, int height) throws IOException{
        return resize((BufferedImage)get_ImageStream(PATH_UNFOLLOW), width, height);
    }

    public Image getWALLPAPER(int width, int height) throws IOException{
        return resize((BufferedImage)get_ImageStream(PATH_WALLPAPER), width, height);
    }

    public Image getYES_ICON(int width, int height) throws IOException{
        return resize((BufferedImage)get_ImageStream(PATH_YES_ICON), width, height);
    }

    public Image getBACK(int width, int height) throws IOException{
        return resize((BufferedImage)get_ImageStream(PATH_BACK), width, height);
    }

    public Image getHOME(int width, int height) throws IOException{
        return resize((BufferedImage)get_ImageStream(PATH_HOME), width, height);
    }

    public Image getINTERACTIVE_TIMELINE(int width, int height) throws IOException{
        return resize((BufferedImage)get_ImageStream(PATH_INTERACTIVE_TIMELINE), width, height);
    }

    public Image getITERACTION_TIMELINE(int width, int height) throws IOException{
        return resize((BufferedImage)get_ImageStream(PATH_ITERACTION_TIMELINE), width, height);
    }

    public Image getLOGOUT(int width, int height) throws IOException{
        return resize((BufferedImage)get_ImageStream(PATH_LOGOUT), width, height);
    }

    public Image getNEXT(int width, int height) throws IOException{
        return resize((BufferedImage)get_ImageStream(PATH_NEXT), width, height);
    }

    public Image getPEOPLE(int width, int height) throws IOException{
        return resize((BufferedImage)get_ImageStream(PATH_PEOPLE), width, height);
    }

    public Image getPROFILE(int width, int height) throws IOException{
        return resize((BufferedImage)get_ImageStream(PATH_PROFILE), width, height);
    }


    public URL getPATH_BALOON() {
        return PATH_BALOON;
    }

    public URL getPATH_DEFAULT_AVATAR() {
        return PATH_DEFAULT_AVATAR;
    }

    public URL getPATH_FOLLOW() {
        return PATH_FOLLOW;
    }

    public URL getPATH_HIDE() {
        return PATH_HIDE;
    }

    public URL getPATH_NO_ICON() {
        return PATH_NO_ICON;
    }

    public URL getPATH_SEND_MESSAGE() {
        return PATH_SEND_MESSAGE;
    }

    public URL getPATH_SETTINGS() {
        return PATH_SETTINGS;
    }

    public URL getPATH_SKILLS() {
        return PATH_SKILLS;
    }

    public URL getPATH_UNFOLLOW() {
        return PATH_UNFOLLOW;
    }

    public URL getPATH_WALLPAPER() {
        return PATH_WALLPAPER;
    }

    public URL getPATH_YES_ICON() {
        return PATH_YES_ICON;
    }

    public URL getPATH_BACK() {
        return PATH_BACK;
    }

    public URL getPATH_HOME() {
        return PATH_HOME;
    }

    public URL getPATH_INTERACTIVE_TIMELINE() {
        return PATH_INTERACTIVE_TIMELINE;
    }

    public URL getPATH_ITERACTION_TIMELINE() {
        return PATH_ITERACTION_TIMELINE;
    }

    public URL getPATH_LOGOUT() {
        return PATH_LOGOUT;
    }

    public URL getPATH_NEXT() {
        return PATH_NEXT;
    }

    public URL getPATH_PEOPLE() {
        return PATH_PEOPLE;
    }

    public URL getPATH_PROFILE() {
        return PATH_PROFILE;
    }
}
