/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package musiccollectionmanager;

/**
 *
 * @author chris
 */
public class MusicCollectionManagerGUI extends javax.swing.JFrame {

    /**
     * Creates new form MusicCollectionManagerGUI
     */
    public MusicCollectionManagerGUI() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        titlePanel = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jTabbedPane1 = new javax.swing.JTabbedPane();
        titleLikedSongs = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        likedSongsList = new javax.swing.JList<>();
        titleGenrePlaylist = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        genreTableList = new javax.swing.JTable();
        songTitle = new javax.swing.JTextField();
        addLikedBtn = new javax.swing.JButton();
        genreSelectorList = new javax.swing.JComboBox<>();
        searchBtn = new javax.swing.JButton();
        titleGenrePlaylist1 = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        addGenreBtn = new javax.swing.JButton();
        deleteSongBtn = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBounds(new java.awt.Rectangle(0, 0, 976, 650));
        setMaximizedBounds(new java.awt.Rectangle(0, 0, 976, 650));
        setMaximumSize(new java.awt.Dimension(976, 650));
        setMinimumSize(new java.awt.Dimension(976, 650));
        setResizable(false);
        setSize(new java.awt.Dimension(976, 650));
        getContentPane().setLayout(null);

        titlePanel.setBackground(new java.awt.Color(51, 51, 51));
        titlePanel.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 3));
        titlePanel.setForeground(new java.awt.Color(255, 255, 255));

        jLabel2.setBackground(new java.awt.Color(255, 255, 255));
        jLabel2.setFont(new java.awt.Font("Segoe UI Black", 1, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Music Collection Manager");
        jLabel2.setToolTipText("");
        jLabel2.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText(" Christian Spinu | x22535543 | CA1 BSHCIFSC2");

        javax.swing.GroupLayout titlePanelLayout = new javax.swing.GroupLayout(titlePanel);
        titlePanel.setLayout(titlePanelLayout);
        titlePanelLayout.setHorizontalGroup(
            titlePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(titlePanelLayout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addGroup(titlePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 330, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(20, Short.MAX_VALUE))
        );
        titlePanelLayout.setVerticalGroup(
            titlePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(titlePanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        getContentPane().add(titlePanel);
        titlePanel.setBounds(310, 10, 380, 70);

        jTabbedPane1.setBackground(new java.awt.Color(0, 0, 0));
        jTabbedPane1.setForeground(new java.awt.Color(255, 255, 255));
        jTabbedPane1.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N

        titleLikedSongs.setBackground(new java.awt.Color(51, 51, 51));
        titleLikedSongs.setMinimumSize(new java.awt.Dimension(400, 70));

        jLabel5.setBackground(new java.awt.Color(255, 255, 255));
        jLabel5.setFont(new java.awt.Font("Segoe UI Black", 1, 24)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Liked Songs");
        jLabel5.setToolTipText("");
        jLabel5.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        likedSongsList.setModel(new javax.swing.AbstractListModel<String>() {
            String[] strings = { "Item 1", "Item 2", "Item 3", "Item 4", "Item 5" };
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }
        });
        jScrollPane2.setViewportView(likedSongsList);

        javax.swing.GroupLayout titleLikedSongsLayout = new javax.swing.GroupLayout(titleLikedSongs);
        titleLikedSongs.setLayout(titleLikedSongsLayout);
        titleLikedSongsLayout.setHorizontalGroup(
            titleLikedSongsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(titleLikedSongsLayout.createSequentialGroup()
                .addGroup(titleLikedSongsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(titleLikedSongsLayout.createSequentialGroup()
                        .addGap(42, 42, 42)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 383, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(titleLikedSongsLayout.createSequentialGroup()
                        .addGap(156, 156, 156)
                        .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 157, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(55, Short.MAX_VALUE))
        );
        titleLikedSongsLayout.setVerticalGroup(
            titleLikedSongsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(titleLikedSongsLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(17, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Liked Songs", titleLikedSongs);

        titleGenrePlaylist.setBackground(new java.awt.Color(51, 51, 51));
        titleGenrePlaylist.setMinimumSize(new java.awt.Dimension(400, 70));

        jLabel6.setBackground(new java.awt.Color(255, 255, 255));
        jLabel6.setFont(new java.awt.Font("Segoe UI Black", 1, 24)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Genre Playlists");
        jLabel6.setToolTipText("");
        jLabel6.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        genreTableList.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {"", null},
                {null, null},
                {null, null},
                {null, null}
            },
            new String [] {
                "Jazz", "Synth"
            }
        ));
        genreTableList.setColumnSelectionAllowed(true);
        genreTableList.getTableHeader().setReorderingAllowed(false);
        jScrollPane1.setViewportView(genreTableList);

        javax.swing.GroupLayout titleGenrePlaylistLayout = new javax.swing.GroupLayout(titleGenrePlaylist);
        titleGenrePlaylist.setLayout(titleGenrePlaylistLayout);
        titleGenrePlaylistLayout.setHorizontalGroup(
            titleGenrePlaylistLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, titleGenrePlaylistLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(36, 36, 36))
            .addGroup(titleGenrePlaylistLayout.createSequentialGroup()
                .addGap(143, 143, 143)
                .addComponent(jLabel6)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        titleGenrePlaylistLayout.setVerticalGroup(
            titleGenrePlaylistLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(titleGenrePlaylistLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(10, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Genre PlayLists", titleGenrePlaylist);

        getContentPane().add(jTabbedPane1);
        jTabbedPane1.setBounds(260, 280, 480, 230);

        songTitle.setBackground(new java.awt.Color(255, 255, 255));
        songTitle.setForeground(new java.awt.Color(102, 102, 102));
        songTitle.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        songTitle.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                songTitleActionPerformed(evt);
            }
        });
        getContentPane().add(songTitle);
        songTitle.setBounds(420, 130, 310, 30);

        addLikedBtn.setBackground(new java.awt.Color(69, 155, 81));
        addLikedBtn.setFont(new java.awt.Font("Segoe UI Emoji", 1, 14)); // NOI18N
        addLikedBtn.setForeground(new java.awt.Color(255, 255, 255));
        addLikedBtn.setText("✅ Add to Liked");
        addLikedBtn.setBorder(null);
        addLikedBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addLikedBtnActionPerformed(evt);
            }
        });
        getContentPane().add(addLikedBtn);
        addLikedBtn.setBounds(440, 170, 130, 30);

        genreSelectorList.setBackground(new java.awt.Color(30, 137, 255));
        genreSelectorList.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        genreSelectorList.setForeground(new java.awt.Color(255, 255, 255));
        genreSelectorList.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Select Genre", "Jazz", "Synth" }));
        genreSelectorList.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                genreSelectorListActionPerformed(evt);
            }
        });
        getContentPane().add(genreSelectorList);
        genreSelectorList.setBounds(290, 210, 190, 30);

        searchBtn.setBackground(new java.awt.Color(224, 173, 19));
        searchBtn.setFont(new java.awt.Font("Segoe UI Emoji", 1, 14)); // NOI18N
        searchBtn.setForeground(new java.awt.Color(255, 255, 255));
        searchBtn.setText("🔍 Search");
        searchBtn.setBorder(null);
        searchBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                searchBtnActionPerformed(evt);
            }
        });
        getContentPane().add(searchBtn);
        searchBtn.setBounds(270, 170, 130, 30);

        titleGenrePlaylist1.setBackground(new java.awt.Color(51, 51, 51));
        titleGenrePlaylist1.setMinimumSize(new java.awt.Dimension(400, 70));

        jLabel7.setBackground(new java.awt.Color(255, 255, 255));
        jLabel7.setFont(new java.awt.Font("Segoe UI Black", 1, 18)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("Song Title:");
        jLabel7.setToolTipText("");
        jLabel7.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        javax.swing.GroupLayout titleGenrePlaylist1Layout = new javax.swing.GroupLayout(titleGenrePlaylist1);
        titleGenrePlaylist1.setLayout(titleGenrePlaylist1Layout);
        titleGenrePlaylist1Layout.setHorizontalGroup(
            titleGenrePlaylist1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(titleGenrePlaylist1Layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addComponent(jLabel7)
                .addContainerGap(278, Short.MAX_VALUE))
        );
        titleGenrePlaylist1Layout.setVerticalGroup(
            titleGenrePlaylist1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(titleGenrePlaylist1Layout.createSequentialGroup()
                .addComponent(jLabel7)
                .addGap(0, 44, Short.MAX_VALUE))
        );

        getContentPane().add(titleGenrePlaylist1);
        titleGenrePlaylist1.setBounds(270, 130, 140, 30);

        addGenreBtn.setBackground(new java.awt.Color(17, 131, 255));
        addGenreBtn.setFont(new java.awt.Font("Segoe UI Emoji", 1, 14)); // NOI18N
        addGenreBtn.setForeground(new java.awt.Color(255, 255, 255));
        addGenreBtn.setText("➕ Add to Genre Playlist");
        addGenreBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addGenreBtnActionPerformed(evt);
            }
        });
        getContentPane().add(addGenreBtn);
        addGenreBtn.setBounds(490, 210, 210, 30);

        deleteSongBtn.setBackground(new java.awt.Color(201, 84, 80));
        deleteSongBtn.setFont(new java.awt.Font("Segoe UI Emoji", 1, 14)); // NOI18N
        deleteSongBtn.setForeground(new java.awt.Color(255, 255, 255));
        deleteSongBtn.setText("❌ Delete Song");
        deleteSongBtn.setBorder(null);
        deleteSongBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deleteSongBtnActionPerformed(evt);
            }
        });
        getContentPane().add(deleteSongBtn);
        deleteSongBtn.setBounds(600, 170, 130, 30);

        jButton2.setBackground(new java.awt.Color(0, 153, 255));
        jButton2.setFont(new java.awt.Font("Segoe UI Emoji", 1, 18)); // NOI18N
        jButton2.setForeground(new java.awt.Color(255, 255, 255));
        jButton2.setText("🔁  REPEAT");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2);
        jButton2.setBounds(510, 530, 220, 70);

        jButton4.setBackground(new java.awt.Color(74, 158, 85));
        jButton4.setFont(new java.awt.Font("Segoe UI Emoji", 1, 18)); // NOI18N
        jButton4.setForeground(new java.awt.Color(255, 255, 255));
        jButton4.setText("▶  ️PLAY");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton4);
        jButton4.setBounds(270, 530, 220, 70);

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/musiccollectionmanager/images/pexels-backdated-10643825 (1).jpg"))); // NOI18N
        jLabel3.setText("jLabel3");
        getContentPane().add(jLabel3);
        jLabel3.setBounds(0, 0, 1017, 650);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void songTitleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_songTitleActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_songTitleActionPerformed

    private void addLikedBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addLikedBtnActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_addLikedBtnActionPerformed

    private void genreSelectorListActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_genreSelectorListActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_genreSelectorListActionPerformed

    private void searchBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_searchBtnActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_searchBtnActionPerformed

    private void addGenreBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addGenreBtnActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_addGenreBtnActionPerformed

    private void deleteSongBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deleteSongBtnActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_deleteSongBtnActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton2ActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(MusicCollectionManagerGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MusicCollectionManagerGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MusicCollectionManagerGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MusicCollectionManagerGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MusicCollectionManagerGUI().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    javax.swing.JButton addGenreBtn;
    javax.swing.JButton addLikedBtn;
    javax.swing.JButton deleteSongBtn;
    javax.swing.JComboBox<String> genreSelectorList;
    javax.swing.JTable genreTableList;
    javax.swing.JButton jButton2;
    javax.swing.JButton jButton4;
    javax.swing.JLabel jLabel1;
    javax.swing.JLabel jLabel2;
    javax.swing.JLabel jLabel3;
    javax.swing.JLabel jLabel5;
    javax.swing.JLabel jLabel6;
    javax.swing.JLabel jLabel7;
    javax.swing.JScrollPane jScrollPane1;
    javax.swing.JScrollPane jScrollPane2;
    javax.swing.JTabbedPane jTabbedPane1;
    javax.swing.JList<String> likedSongsList;
    javax.swing.JButton searchBtn;
    javax.swing.JTextField songTitle;
    javax.swing.JPanel titleGenrePlaylist;
    javax.swing.JPanel titleGenrePlaylist1;
    javax.swing.JPanel titleLikedSongs;
    javax.swing.JPanel titlePanel;
    // End of variables declaration//GEN-END:variables
}
