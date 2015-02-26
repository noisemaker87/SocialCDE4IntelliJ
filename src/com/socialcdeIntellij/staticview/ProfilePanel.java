/*
 * Created by JFormDesigner on Mon Feb 23 12:22:55 CET 2015
 */

package com.socialcdeIntellij.staticview;

import org.jdesktop.swingx.VerticalLayout;

import javax.imageio.ImageIO;
import javax.swing.*;
import javax.swing.border.*;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.IOException;
import java.io.InputStream;
import java.util.HashMap;

/**
 * @author Davide Rossi
 */
public class ProfilePanel extends JPanel {
    private final InputStream PATH_DEFAULT_AVATAR = this.getClass()
            .getClassLoader().getResourceAsStream("images/DefaultAvatar.png");
    private final InputStream PATH_BALOON = this.getClass().getClassLoader()
            .getResourceAsStream("images/Baloon.png");
    private final InputStream PATH_BACK = this.getClass().getClassLoader()
            .getResourceAsStream("images/Toolbar/Back.png");
    private final InputStream PATH_FOLLOW = this.getClass().getClassLoader()
            .getResourceAsStream("images/Toolbar/Follow.png");
    private final InputStream PATH_HIDE = this.getClass().getClassLoader()
            .getResourceAsStream("images/Toolbar/Hide.png");
    private final InputStream PATH_HOME = this.getClass().getClassLoader()
            .getResourceAsStream("images/Toolbar/Home.png");
    private final InputStream PATH_INTERACTIVE_TIMELINE = this.getClass()
            .getClassLoader()
            .getResourceAsStream("images/Toolbar/InteractiveTimeline.png");
    private final InputStream PATH_INTERACTION_TIMELINE = this.getClass()
            .getClassLoader()
            .getResourceAsStream("images/Toolbar/IterationTimeline.png");
    private final InputStream PATH_LOGOUT = this.getClass().getClassLoader()
            .getResourceAsStream("images/Toolbar/Logout.png");
    private final InputStream PATH_PEOPLE = this.getClass().getClassLoader()
            .getResourceAsStream("images/Toolbar/People.png");
    private final InputStream PATH_WALLPAPER = this.getClass().getClassLoader()
            .getResourceAsStream("images/Wallpaper.png");

    private JPanel composite_static;
    private JPanel composite_dinamic;

    /* private Image getUserImage() throws IOException {
        try
        {
            return resize((BufferedImage) get_ImageStream(new URL(Controller
                    .getCurrentUser().Avatar).openStream()),32,32);
        } catch (IOException e)
        {
            return resize((BufferedImage) get_ImageStream(PATH_DEFAULT_AVATAR),32,32);
        } catch (NullPointerException e)
        {
            return resize((BufferedImage) get_ImageStream(PATH_DEFAULT_AVATAR),32,32);
        }
    }*/

    private BufferedImage resize(BufferedImage originalImage, int width, int height) throws IOException {
        BufferedImage resizedImage = null;
        Graphics2D g = resizedImage.createGraphics();
        g.drawImage(originalImage, 0, 0, width, height, null);
        g.dispose();
        return resizedImage;
    }//ridimensione immagine

    public Image get_ImageStream(InputStream stream) throws IOException {
        Image image = ImageIO.read(stream);
        return image;
    }//prende immagine da stream

    public ProfilePanel() {
        initComponents();
    }

    private void initComponents() {
        // JFormDesigner - Component initialization - DO NOT MODIFY  //GEN-BEGIN:initComponents
        // Generated using JFormDesigner Evaluation license - Davide Rossi
        panelToolbar = new JPanel();
        lblHome = new JLabel();
        lblPeople = new JLabel();
        lblBoh = new JLabel();
        lblIterationTimeline = new JLabel();
        lblInteractiveTimeline = new JLabel();
        lblLogout = new JLabel();
        panelProfile = new JPanel();
        lblAvatar = new JLabel();
        panelInfo = new JPanel();
        panelSettings = new JPanel();
        lblNickname = new JLabel();
        panelSubSettings = new JPanel();
        lblSkills = new JLabel();
        lblSettings = new JLabel();
        panelInfo2 = new JPanel();
        panelPost = new JPanel();
        lblPosts = new JLabel();
        lblNumPost = new JLabel();
        panelfollowing = new JPanel();
        lblFollowing = new JLabel();
        lblNumFollowing = new JLabel();
        panelFollowers = new JPanel();
        lblFollowers = new JLabel();
        lblNumFollowers = new JLabel();
        scrollPane1 = new JScrollPane();
        panelDynamic = new JPanel();

        //======== this ========
        setPreferredSize(new Dimension(450, 600));

        // JFormDesigner evaluation mark
        setBorder(new javax.swing.border.CompoundBorder(
                new javax.swing.border.TitledBorder(new javax.swing.border.EmptyBorder(0, 0, 0, 0),
                        "JFormDesigner Evaluation", javax.swing.border.TitledBorder.CENTER,
                        javax.swing.border.TitledBorder.BOTTOM, new java.awt.Font("Dialog", java.awt.Font.BOLD, 12),
                        java.awt.Color.red), getBorder())); addPropertyChangeListener(new java.beans.PropertyChangeListener(){public void propertyChange(java.beans.PropertyChangeEvent e){if("border".equals(e.getPropertyName()))throw new RuntimeException();}});

        setLayout(new VerticalLayout());

        //======== panelToolbar ========
        {
            panelToolbar.setBackground(new Color(204, 204, 204));
            panelToolbar.setLayout(new FlowLayout(FlowLayout.LEFT, 15, 5));

            //---- lblHome ----
            lblHome.setIcon(new ImageIcon("D:\\workspaceIntelliJ\\SocialCDEplugin\\images\\Toolbar\\Home.png"));
            panelToolbar.add(lblHome);

            //---- lblPeople ----
            lblPeople.setIcon(new ImageIcon("D:\\workspaceIntelliJ\\SocialCDEplugin\\images\\Toolbar\\People.png"));
            panelToolbar.add(lblPeople);

            //---- lblBoh ----
            lblBoh.setIcon(new ImageIcon("D:\\workspaceIntelliJ\\SocialCDEplugin\\images\\Toolbar\\Back.png"));
            panelToolbar.add(lblBoh);

            //---- lblIterationTimeline ----
            lblIterationTimeline.setIcon(new ImageIcon("D:\\workspaceIntelliJ\\SocialCDEplugin\\images\\Toolbar\\IterationTimeline.png"));
            panelToolbar.add(lblIterationTimeline);

            //---- lblInteractiveTimeline ----
            lblInteractiveTimeline.setIcon(new ImageIcon("D:\\workspaceIntelliJ\\SocialCDEplugin\\images\\Toolbar\\InteractiveTimeline.png"));
            panelToolbar.add(lblInteractiveTimeline);

            //---- lblLogout ----
            lblLogout.setIcon(new ImageIcon("D:\\workspaceIntelliJ\\SocialCDEplugin\\images\\Toolbar\\Logout.png"));
            panelToolbar.add(lblLogout);
        }
        add(panelToolbar);

        //======== panelProfile ========
        {
            panelProfile.setBackground(Color.white);
            panelProfile.setLayout(new FlowLayout(FlowLayout.LEFT));

            //---- lblAvatar ----
            lblAvatar.setIcon(new ImageIcon("D:\\workspaceIntelliJ\\SocialCDEplugin\\images\\DefaultAvatar.png"));
            panelProfile.add(lblAvatar);

            //======== panelInfo ========
            {
                panelInfo.setBackground(Color.white);
                panelInfo.setLayout(new GridLayout(2, 0, 0, 10));

                //======== panelSettings ========
                {
                    panelSettings.setBackground(Color.white);
                    panelSettings.setLayout(new FlowLayout(FlowLayout.CENTER, 25, 5));

                    //---- lblNickname ----
                    lblNickname.setText("nickname qui");
                    lblNickname.setHorizontalAlignment(SwingConstants.LEFT);
                    panelSettings.add(lblNickname);

                    //======== panelSubSettings ========
                    {
                        panelSubSettings.setBackground(Color.white);
                        panelSubSettings.setLayout(new FlowLayout());

                        //---- lblSkills ----
                        lblSkills.setIcon(new ImageIcon("D:\\workspaceIntelliJ\\SocialCDEplugin\\images\\skills.png"));
                        panelSubSettings.add(lblSkills);

                        //---- lblSettings ----
                        lblSettings.setIcon(new ImageIcon("D:\\workspaceIntelliJ\\SocialCDEplugin\\images\\settings.png"));
                        panelSubSettings.add(lblSettings);
                    }
                    panelSettings.add(panelSubSettings);
                }
                panelInfo.add(panelSettings);

                //======== panelInfo2 ========
                {
                    panelInfo2.setBackground(Color.white);
                    panelInfo2.setLayout(new GridLayout(1, 3, 10, 0));

                    //======== panelPost ========
                    {
                        panelPost.setBackground(Color.white);
                        panelPost.setBorder(new MatteBorder(0, 0, 0, 1, Color.black));
                        panelPost.setLayout(new GridLayout(2, 1));

                        //---- lblPosts ----
                        lblPosts.setText("Posts");
                        lblPosts.setHorizontalAlignment(SwingConstants.CENTER);
                        panelPost.add(lblPosts);

                        //---- lblNumPost ----
                        lblNumPost.setText("0");
                        lblNumPost.setHorizontalAlignment(SwingConstants.CENTER);
                        panelPost.add(lblNumPost);
                    }
                    panelInfo2.add(panelPost);

                    //======== panelfollowing ========
                    {
                        panelfollowing.setBackground(Color.white);
                        panelfollowing.setLayout(new GridLayout(2, 1));

                        //---- lblFollowing ----
                        lblFollowing.setText("Following");
                        lblFollowing.setHorizontalAlignment(SwingConstants.CENTER);
                        panelfollowing.add(lblFollowing);

                        //---- lblNumFollowing ----
                        lblNumFollowing.setText("1");
                        lblNumFollowing.setHorizontalAlignment(SwingConstants.CENTER);
                        panelfollowing.add(lblNumFollowing);
                    }
                    panelInfo2.add(panelfollowing);

                    //======== panelFollowers ========
                    {
                        panelFollowers.setBackground(Color.white);
                        panelFollowers.setBorder(new MatteBorder(0, 1, 0, 0, Color.black));
                        panelFollowers.setPreferredSize(new Dimension(86, 32));
                        panelFollowers.setLayout(new GridLayout(2, 1));

                        //---- lblFollowers ----
                        lblFollowers.setText("Followers");
                        lblFollowers.setHorizontalAlignment(SwingConstants.CENTER);
                        lblFollowers.setAlignmentX(0.5F);
                        lblFollowers.setHorizontalTextPosition(SwingConstants.CENTER);
                        panelFollowers.add(lblFollowers);

                        //---- lblNumFollowers ----
                        lblNumFollowers.setText("0");
                        lblNumFollowers.setHorizontalAlignment(SwingConstants.CENTER);
                        panelFollowers.add(lblNumFollowers);
                    }
                    panelInfo2.add(panelFollowers);
                }
                panelInfo.add(panelInfo2);
            }
            panelProfile.add(panelInfo);
        }
        add(panelProfile);

        //======== scrollPane1 ========
        {

            //======== panelDynamic ========
            {
                panelDynamic.setBackground(Color.white);
                panelDynamic.setPreferredSize(new Dimension(400, 800));
                panelDynamic.setBorder(new BevelBorder(BevelBorder.LOWERED));
                panelDynamic.setMinimumSize(new Dimension(400, 800));
                panelDynamic.setLayout(new VerticalLayout(15));
            }
            scrollPane1.setViewportView(panelDynamic);
        }
        add(scrollPane1);
        // JFormDesigner - End of component initialization  //GEN-END:initComponents
    }



    public JLabel getLblAvatar() {
        return lblAvatar;
    }

    public void setLblAvatar(JLabel lblAvatar) {
        this.lblAvatar = lblAvatar;
    }

    public JLabel getLblPeople() {

        return lblPeople;
    }

    public void setLblPeople(JLabel lblPeople) {
        this.lblPeople = lblPeople;
    }

    public JLabel getLblInteractiveTimeline() {

        return lblInteractiveTimeline;
    }

    public void setLblInteractiveTimeline(JLabel lblInteractiveTimeline) {
        this.lblInteractiveTimeline = lblInteractiveTimeline;
    }

    public JLabel getLblIterationTimeline() {
        return lblIterationTimeline;
    }

    public void setLblIterationTimeline(JLabel lblIterationTimeline) {
        this.lblIterationTimeline = lblIterationTimeline;
    }

    public JPanel getComposite_dinamic() {
        return composite_dinamic;
    }

    public void setComposite_dinamic(JPanel composite_dinamic) {
        this.composite_dinamic = composite_dinamic;
    }

    public JPanel getComposite_static() {
        return composite_static;
    }

    public void setComposite_static(JPanel composite_static) {
        this.composite_static = composite_static;
    }

    public HashMap<String, Object> getData() {
        // TODO Auto-generated method stub
        return null;
    }

    // JFormDesigner - Variables declaration - DO NOT MODIFY  //GEN-BEGIN:variables
    // Generated using JFormDesigner Evaluation license - Davide Rossi
    private JPanel panelToolbar;
    private JLabel lblHome;
    private JLabel lblPeople;
    private JLabel lblBoh;
    private JLabel lblIterationTimeline;
    private JLabel lblInteractiveTimeline;
    private JLabel lblLogout;
    private JPanel panelProfile;
    private JLabel lblAvatar;
    private JPanel panelInfo;
    private JPanel panelSettings;
    private JLabel lblNickname;
    private JPanel panelSubSettings;
    private JLabel lblSkills;
    private JLabel lblSettings;
    private JPanel panelInfo2;
    private JPanel panelPost;
    private JLabel lblPosts;
    private JLabel lblNumPost;
    private JPanel panelfollowing;
    private JLabel lblFollowing;
    private JLabel lblNumFollowing;
    private JPanel panelFollowers;
    private JLabel lblFollowers;
    private JLabel lblNumFollowers;
    private JScrollPane scrollPane1;
    private JPanel panelDynamic;
    // JFormDesigner - End of variables declaration  //GEN-END:variables
}
