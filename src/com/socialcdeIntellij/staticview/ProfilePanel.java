/*
 * Created by JFormDesigner on Mon Feb 23 12:22:55 CET 2015
 */

package com.socialcdeIntellij.staticview;



import com.intellij.util.ui.UIUtil;
import com.socialcdeIntellij.action.ActionGeneral;
import com.socialcdeIntellij.object.ImagesMod;
import org.jdesktop.swingx.VerticalLayout;
import javax.imageio.ImageIO;
import javax.swing.*;
import javax.swing.border.*;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.IOException;
import java.net.URL;
import java.util.HashMap;

/**
 * @author Davide Rossi
 */
public class ProfilePanel extends JPanel {

    private JPanel composite_static;
    private JPanel composite_dinamic;
    private ImagesMod im = new ImagesMod();

    private ActionGeneral listener;


    public ProfilePanel() {
        initComponents();
    }

    private void initComponents()  {
        // JFormDesigner - Component initialization - DO NOT MODIFY  //GEN-BEGIN:initComponents
        // Generated using JFormDesigner Evaluation license - Pablo Rossi
        panelToolbar = new JPanel();
        lblProfile = new JLabel();
        lblPeople = new JLabel();
        lblHomeTimeline = new JLabel();
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
        setPreferredSize(new Dimension(399, 604));
        setMinimumSize(new Dimension(399, 304));

        // JFormDesigner evaluation mark
        setBorder(new javax.swing.border.CompoundBorder(
            new javax.swing.border.TitledBorder(new javax.swing.border.EmptyBorder(0, 0, 0, 0),
                "JFormDesigner Evaluation", javax.swing.border.TitledBorder.CENTER,
                javax.swing.border.TitledBorder.BOTTOM, new java.awt.Font("Dialog", java.awt.Font.BOLD, 12),
                java.awt.Color.red), getBorder())); addPropertyChangeListener(new java.beans.PropertyChangeListener(){public void propertyChange(java.beans.PropertyChangeEvent e){if("border".equals(e.getPropertyName()))throw new RuntimeException();}});

        setLayout(new VerticalLayout(2));

        //======== panelToolbar ========
        {
            panelToolbar.setBackground(new Color(204, 204, 204));
            panelToolbar.setLayout(new FlowLayout(FlowLayout.LEFT, 15, 5));

            //---- lblProfile ----
            lblProfile.setIcon(new ImageIcon(getClass().getResource("/images/Toolbar/Profile.png")));
            lblProfile.setToolTipText("Profile");
            lblProfile.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
            lblProfile.setName("lblProfile");
            panelToolbar.add(lblProfile);

            //---- lblPeople ----
            lblPeople.setIcon(new ImageIcon(getClass().getResource("/images/Toolbar/People.png")));
            lblPeople.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
            lblPeople.setName("lblPeople");
            lblPeople.setToolTipText("People");
            panelToolbar.add(lblPeople);

            //---- lblHomeTimeline ----
            lblHomeTimeline.setIcon(new ImageIcon(getClass().getResource("/images/Toolbar/Home.png")));
            lblHomeTimeline.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
            lblHomeTimeline.setName("lblHomeTimeline");
            lblHomeTimeline.setToolTipText("Home Timeline");
            panelToolbar.add(lblHomeTimeline);

            //---- lblIterationTimeline ----
            lblIterationTimeline.setIcon(new ImageIcon(getClass().getResource("/images/Toolbar/IterationTimeline.png")));
            lblIterationTimeline.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
            lblIterationTimeline.setToolTipText("Iteration Timeline");
            lblIterationTimeline.setName("lblIterationTimeline");
            panelToolbar.add(lblIterationTimeline);

            //---- lblInteractiveTimeline ----
            lblInteractiveTimeline.setIcon(new ImageIcon(getClass().getResource("/images/Toolbar/InteractiveTimeline.png")));
            lblInteractiveTimeline.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
            lblInteractiveTimeline.setName("lblInteractiveTimeline");
            lblInteractiveTimeline.setToolTipText("Interactive Timeline");
            panelToolbar.add(lblInteractiveTimeline);

            //---- lblLogout ----
            lblLogout.setIcon(new ImageIcon(getClass().getResource("/images/Toolbar/Logout.png")));
            lblLogout.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
            lblLogout.setToolTipText("Logout");
            lblLogout.setName("lblLogout");
            panelToolbar.add(lblLogout);
        }
        add(panelToolbar);

        //======== panelProfile ========
        {
            panelProfile.setBackground(Color.white);
            panelProfile.setLayout(new FlowLayout(FlowLayout.LEFT));

            //---- lblAvatar ----
            lblAvatar.setIcon(new ImageIcon(getClass().getResource("/images/DefaultAvatar.png")));
            lblAvatar.setName("lblAvatar");
            lblAvatar.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
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
                    lblNickname.setName("lblNickname");
                    panelSettings.add(lblNickname);

                    //======== panelSubSettings ========
                    {
                        panelSubSettings.setBackground(Color.white);
                        panelSubSettings.setLayout(new FlowLayout());

                        //---- lblSkills ----
                        lblSkills.setIcon(new ImageIcon(getClass().getResource("/images/skills.png")));
                        lblSkills.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
                        lblSkills.setToolTipText("Skills");
                        lblSkills.setName("lblSkills");
                        panelSubSettings.add(lblSkills);

                        //---- lblSettings ----
                        lblSettings.setIcon(new ImageIcon(getClass().getResource("/images/settings.png")));
                        lblSettings.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
                        lblSettings.setName("lblSettings");
                        lblSettings.setToolTipText("Change Password");
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
                        lblNumPost.setName("lblNumPost");
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
                        lblNumFollowing.setName("lblNumFollowing");
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
                        lblNumFollowers.setName("lblNumFollowers");
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

        listener = new ActionGeneral();

        lblProfile.addMouseListener(listener);
        lblPeople.addMouseListener(listener);
        lblHomeTimeline.addMouseListener(listener);
        lblIterationTimeline.addMouseListener(listener);
        lblInteractiveTimeline.addMouseListener(listener);
        lblLogout.addMouseListener(listener);

        lblSkills.addMouseListener(listener);
        lblSettings.addMouseListener(listener);
    }


    public JLabel getLblAvatar() {
        return lblAvatar;
    }

    public void setLblAvatar(JLabel lblAvatar) {
        this.lblAvatar = lblAvatar;
    }

    public JPanel getInfoPanel(){return this.panelProfile;}

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


    // JFormDesigner - Variables declaration - DO NOT MODIFY  //GEN-BEGIN:variables
    // Generated using JFormDesigner Evaluation license - Pablo Rossi
    private JPanel panelToolbar;
    private JLabel lblProfile;
    private JLabel lblPeople;
    private JLabel lblHomeTimeline;
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


    public HashMap<String, Object> getData() {
        HashMap<String, Object> uiData = new HashMap<String, Object>();
        uiData.put("LabelProfile", lblProfile);
        uiData.put("LabelPeople", lblPeople);
        uiData.put("LabelHomeTimeline",lblHomeTimeline);
        uiData.put("LabelIterationTimeline", lblIterationTimeline);
        uiData.put("LabelInteractiveTimeline",lblInteractiveTimeline);
        uiData.put("LabelLogout", lblLogout);

        uiData.put("LabelUsername",lblNickname);
        uiData.put("LabelAvatar", lblAvatar);
        uiData.put("LabelN_Post",lblNumPost);
        uiData.put("LabelN_Following", lblNumFollowing);
        uiData.put("LabelN_Followers",lblNumFollowers);
        uiData.put("LabelSkills", lblSkills);
        uiData.put("LabelSettings",lblSettings);

        return uiData;
    }
}
