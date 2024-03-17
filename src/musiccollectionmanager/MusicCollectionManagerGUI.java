package musiccollectionmanager;

import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.DefaultListModel;
import javax.swing.JLabel;
import javax.swing.SwingUtilities;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author chris
 */
public final class MusicCollectionManagerGUI extends javax.swing.JFrame{
    private final MusicCollectionManagerApp app;
    private final DefaultListModel<String> likedSongsModel; // Declare the model at the class level

    
    public MusicCollectionManagerGUI(MusicCollectionManagerApp app) {
        this.app = app;
        initComponents(); // Initialize GUI components first

        likedSongsModel = new DefaultListModel<>(); // Create the model for liked songs
        likedSongsList.setModel(likedSongsModel); // Set the model to the JList

        updateCounters(); // Update counters based on the current state
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
        likedSongsCounter = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        likedSongsList = new javax.swing.JList<>();
        titleGenrePlaylist = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        genreTableList = new javax.swing.JTable();
        synthCounter = new javax.swing.JLabel();
        jazzCounter = new javax.swing.JLabel();
        songTitle = new javax.swing.JTextField();
        addLikedBtn = new javax.swing.JButton();
        genreSelectorList = new javax.swing.JComboBox<>();
        searchBtn = new javax.swing.JButton();
        titleGenrePlaylist1 = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        addGenreBtn = new javax.swing.JButton();
        deleteSongBtn = new javax.swing.JButton();
        repeatBtn = new javax.swing.JButton();
        playBtn = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBounds(new java.awt.Rectangle(0, 0, 976, 650));
        setMaximizedBounds(new java.awt.Rectangle(0, 0, 976, 650));
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
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel1)
                .addContainerGap(11, Short.MAX_VALUE))
        );

        getContentPane().add(titlePanel);
        titlePanel.setBounds(310, 10, 380, 70);

        jTabbedPane1.setBackground(new java.awt.Color(0, 0, 0));
        jTabbedPane1.setForeground(new java.awt.Color(255, 255, 255));
        jTabbedPane1.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N

        titleLikedSongs.setBackground(new java.awt.Color(51, 51, 51));
        titleLikedSongs.setMinimumSize(new java.awt.Dimension(400, 70));

        likedSongsCounter.setBackground(new java.awt.Color(255, 255, 255));
        likedSongsCounter.setFont(new java.awt.Font("Segoe UI Black", 1, 24)); // NOI18N
        likedSongsCounter.setForeground(new java.awt.Color(255, 255, 255));
        likedSongsCounter.setToolTipText("");
        likedSongsCounter.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

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
                .addGap(42, 42, 42)
                .addGroup(titleLikedSongsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 383, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(likedSongsCounter, javax.swing.GroupLayout.PREFERRED_SIZE, 189, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(55, Short.MAX_VALUE))
        );
        titleLikedSongsLayout.setVerticalGroup(
            titleLikedSongsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(titleLikedSongsLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(likedSongsCounter, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(17, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Liked Songs", titleLikedSongs);

        titleGenrePlaylist.setBackground(new java.awt.Color(51, 51, 51));
        titleGenrePlaylist.setMinimumSize(new java.awt.Dimension(400, 70));

        genreTableList.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Jazz", "Synth"
            }
        ));
        genreTableList.setColumnSelectionAllowed(true);
        genreTableList.getTableHeader().setReorderingAllowed(false);
        jScrollPane1.setViewportView(genreTableList);
        genreTableList.getColumnModel().getSelectionModel().setSelectionMode(javax.swing.ListSelectionModel.SINGLE_INTERVAL_SELECTION);

        synthCounter.setBackground(new java.awt.Color(255, 255, 255));
        synthCounter.setFont(new java.awt.Font("Segoe UI Black", 1, 18)); // NOI18N
        synthCounter.setForeground(new java.awt.Color(255, 255, 255));
        synthCounter.setToolTipText("");
        synthCounter.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        jazzCounter.setBackground(new java.awt.Color(255, 255, 255));
        jazzCounter.setFont(new java.awt.Font("Segoe UI Black", 1, 18)); // NOI18N
        jazzCounter.setForeground(new java.awt.Color(255, 255, 255));
        jazzCounter.setToolTipText("");
        jazzCounter.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        javax.swing.GroupLayout titleGenrePlaylistLayout = new javax.swing.GroupLayout(titleGenrePlaylist);
        titleGenrePlaylist.setLayout(titleGenrePlaylistLayout);
        titleGenrePlaylistLayout.setHorizontalGroup(
            titleGenrePlaylistLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(titleGenrePlaylistLayout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addComponent(jazzCounter, javax.swing.GroupLayout.PREFERRED_SIZE, 195, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(synthCounter, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(38, 38, 38))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, titleGenrePlaylistLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(36, 36, 36))
        );
        titleGenrePlaylistLayout.setVerticalGroup(
            titleGenrePlaylistLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(titleGenrePlaylistLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(titleGenrePlaylistLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(synthCounter, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jazzCounter, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 153, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        jTabbedPane1.addTab("Genre PlayLists", titleGenrePlaylist);

        getContentPane().add(jTabbedPane1);
        jTabbedPane1.setBounds(260, 280, 480, 230);

        songTitle.setBackground(new java.awt.Color(255, 255, 255));
        songTitle.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        songTitle.setForeground(new java.awt.Color(0, 0, 0));
        songTitle.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 3));
        songTitle.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                songTitleActionPerformed(evt);
            }
        });
        getContentPane().add(songTitle);
        songTitle.setBounds(380, 130, 350, 30);

        addLikedBtn.setBackground(new java.awt.Color(69, 155, 81));
        addLikedBtn.setFont(new java.awt.Font("Segoe UI Emoji", 1, 14)); // NOI18N
        addLikedBtn.setForeground(new java.awt.Color(255, 255, 255));
        addLikedBtn.setText("  ✔️ Add to Liked");
        addLikedBtn.setBorder(null);
        addLikedBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addLikedBtnActionPerformed(evt);
            }
        });
        getContentPane().add(addLikedBtn);
        addLikedBtn.setBounds(430, 170, 140, 30);

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
        titleGenrePlaylist1.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 3, true));
        titleGenrePlaylist1.setMinimumSize(new java.awt.Dimension(400, 70));

        jLabel7.setBackground(new java.awt.Color(255, 255, 255));
        jLabel7.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("Song Title:");
        jLabel7.setToolTipText("");
        jLabel7.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        javax.swing.GroupLayout titleGenrePlaylist1Layout = new javax.swing.GroupLayout(titleGenrePlaylist1);
        titleGenrePlaylist1.setLayout(titleGenrePlaylist1Layout);
        titleGenrePlaylist1Layout.setHorizontalGroup(
            titleGenrePlaylist1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(titleGenrePlaylist1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(287, Short.MAX_VALUE))
        );
        titleGenrePlaylist1Layout.setVerticalGroup(
            titleGenrePlaylist1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(titleGenrePlaylist1Layout.createSequentialGroup()
                .addComponent(jLabel7)
                .addGap(0, 39, Short.MAX_VALUE))
        );

        getContentPane().add(titleGenrePlaylist1);
        titleGenrePlaylist1.setBounds(270, 130, 110, 30);

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

        repeatBtn.setBackground(new java.awt.Color(0, 153, 255));
        repeatBtn.setFont(new java.awt.Font("Segoe UI Emoji", 1, 18)); // NOI18N
        repeatBtn.setForeground(new java.awt.Color(255, 255, 255));
        repeatBtn.setText("🔁  REPEAT");
        repeatBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                repeatBtnActionPerformed(evt);
            }
        });
        getContentPane().add(repeatBtn);
        repeatBtn.setBounds(510, 530, 220, 70);

        playBtn.setBackground(new java.awt.Color(74, 158, 85));
        playBtn.setFont(new java.awt.Font("Segoe UI Emoji", 1, 18)); // NOI18N
        playBtn.setForeground(new java.awt.Color(255, 255, 255));
        playBtn.setText("⏯ PLAY");
        playBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                playBtnActionPerformed(evt);
            }
        });
        getContentPane().add(playBtn);
        playBtn.setBounds(270, 530, 220, 70);

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
        String songTitleText = songTitle.getText().trim(); // Use the correct JTextField variable name here
        if (songTitleText.isEmpty()) {
            JOptionPane.showMessageDialog(null, "Please enter a song title.", "Warning", JOptionPane.WARNING_MESSAGE);
            return;
        }

        if (!likedSongsModel.contains(songTitleText)) {
            likedSongsModel.addElement(songTitleText); // Add the song title to the model
            songTitle.setText(""); // Clear the text field after adding the song
        } else {
            JOptionPane.showMessageDialog(null, "This song is already in your Liked Songs list.", "Duplicate Entry", JOptionPane.WARNING_MESSAGE);
        }
    }//GEN-LAST:event_addLikedBtnActionPerformed
     
    private void genreSelectorListActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_genreSelectorListActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_genreSelectorListActionPerformed

    private void searchBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_searchBtnActionPerformed
        // Get the song title from the text field
        String searchQuery = songTitle.getText().trim();

        // Check if the song title is not empty
        if (!searchQuery.isEmpty()) {
            // Search for the song in the likedSongsModel
            int index = likedSongsModel.indexOf(searchQuery);

            // If found, select the song in the JList and ensure it is visible to the user
            if (index != -1) {
                likedSongsList.setSelectedIndex(index);
                likedSongsList.ensureIndexIsVisible(index);
                JOptionPane.showMessageDialog(this, "Song found: " + searchQuery, "Song Found", JOptionPane.INFORMATION_MESSAGE);
            } else {
                JOptionPane.showMessageDialog(this, "Song not found in Liked Songs.", "Not Found", JOptionPane.WARNING_MESSAGE);
            }
        } else {
            JOptionPane.showMessageDialog(this, "Please enter a song title to search.", "Warning", JOptionPane.WARNING_MESSAGE);
        }
    }//GEN-LAST:event_searchBtnActionPerformed

    private void addGenreBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addGenreBtnActionPerformed
        int selectedSongIndex = likedSongsList.getSelectedIndex();
        if (selectedSongIndex == -1) {
            JOptionPane.showMessageDialog(this, "Please select a song to add to a genre playlist.", "No Selection", JOptionPane.WARNING_MESSAGE);
            return; 
        }

        String selectedGenre = genreSelectorList.getSelectedItem().toString();
        if (selectedGenre.equals("Select Genre")) {
            JOptionPane.showMessageDialog(this, "Please select a genre.", "No Genre Selected", JOptionPane.WARNING_MESSAGE);
            return;
        }

        String songTitle = likedSongsModel.getElementAt(selectedSongIndex);

        // Remove song from any genre (if present) and add to the selected new genre
        moveSongToGenre(songTitle, selectedGenre);
    }//GEN-LAST:event_addGenreBtnActionPerformed

    private void moveSongToGenre(String songTitle, String newGenre) {
        DefaultTableModel model = (DefaultTableModel) genreTableList.getModel();

        // Find the song in the table and remove it
        for (int i = 0; i < model.getRowCount(); i++) {
            if (songTitle.equals(model.getValueAt(i, 0)) || songTitle.equals(model.getValueAt(i, 1))) {
                if (newGenre.equalsIgnoreCase("Jazz")) {
                    // Move to Jazz column: set Synth column to "", set Jazz column to songTitle
                    model.setValueAt("", i, 1);
                    model.setValueAt(songTitle, i, 0);
                } else if (newGenre.equalsIgnoreCase("Synth")) {
                    // Move to Synth column: set Jazz column to "", set Synth column to songTitle
                    model.setValueAt("", i, 0);
                    model.setValueAt(songTitle, i, 1);
                }
                return; // Stop searching after finding the song
            }
        }

        // If the song is not found in the table, add it as a new row
        if (newGenre.equalsIgnoreCase("Jazz")) {
            model.addRow(new Object[]{songTitle, ""}); // Add to Jazz column
        } else if (newGenre.equalsIgnoreCase("Synth")) {
            model.addRow(new Object[]{"", songTitle}); // Add to Synth column
        }
    }
    
    private void deleteSongBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deleteSongBtnActionPerformed
        // Get the song title from the text field
        String songTitleToDelete = songTitle.getText().trim();

        // First, try to delete by selection in the JList
        int selectedIndex = likedSongsList.getSelectedIndex();
        if (selectedIndex != -1) {
            // Delete by selected index if there is a selection
            String selectedSong = likedSongsModel.getElementAt(selectedIndex);
            likedSongsModel.remove(selectedIndex);
            app.removeSongFromLiked(selectedSong);
            removeSongFromGenreTableList(selectedSong); // Update the table
            JOptionPane.showMessageDialog(this, "Song removed from Liked Songs.", "Success", JOptionPane.INFORMATION_MESSAGE);
            
        } else if (!songTitleToDelete.isEmpty()) {
            // If nothing is selected, but a title is entered, try to delete by song title
            if (likedSongsModel.contains(songTitleToDelete)) {
                likedSongsModel.removeElement(songTitleToDelete);
                app.removeSongFromLiked(songTitleToDelete);
                removeSongFromGenreTableList(songTitleToDelete); // Update the table
                JOptionPane.showMessageDialog(this, "Song removed from Liked Songs.", "Success", JOptionPane.INFORMATION_MESSAGE);
                
            } else {
                JOptionPane.showMessageDialog(this, "Song not found in Liked Songs.", "Error", JOptionPane.ERROR_MESSAGE);
                
            }
        } else {
            // If there's no selection and no text input, show a warning message
            JOptionPane.showMessageDialog(this, "Please select a song or enter a title to delete.", "No Selection", JOptionPane.WARNING_MESSAGE);
        }

        // Clear the text field after delete action
        songTitle.setText("");
    }//GEN-LAST:event_deleteSongBtnActionPerformed
    
    private void removeSongFromGenreTableList(String songTitle) {
        DefaultTableModel model = (DefaultTableModel) genreTableList.getModel();
        for (int i = model.getRowCount() - 1; i >= 0; i--) {
            if (model.getValueAt(i, 0).equals(songTitle) || model.getValueAt(i, 1).equals(songTitle)) {
                model.removeRow(i);
                // If the song can exist in only one genre at a time, you can break after finding the song
                
                break;
            }
        }
    }
    
    private boolean isRepeatEnabled = false; // To track the repeat status
    private void playBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_playBtnActionPerformed
        // This method could list the songs in the playlist
        List<String> playlist = app.getLikedSongs(); // This should be the list you want to "play"
        for (String song : playlist) {
            System.out.println(song); // This could be replaced with a GUI element to display songs
        }
    }//GEN-LAST:event_playBtnActionPerformed

    private void repeatBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_repeatBtnActionPerformed
        //Toggle the repeat status
        isRepeatEnabled = !isRepeatEnabled;
        repeatBtn.setText(isRepeatEnabled ? "Repeat On" : "Repeat Off"); // Update button text based on repeat status
    }//GEN-LAST:event_repeatBtnActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                MusicCollectionManagerApp app = new MusicCollectionManagerApp();
                MusicCollectionManagerGUI myGUI = new MusicCollectionManagerGUI(app);
                myGUI.setVisible(true);
            }
        });

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
    }
    
    public void updateCounters() {
        likedSongsCounter.setText("Liked Songs: " + app.getLikedSongs().size());
        jazzCounter.setText("Jazz Songs: " + app.getJazzSongs().size());
        synthCounter.setText("Synth Songs: " + app.getSynthSongs().size());
    }



    public void updateCountersOnEDT() {
        // Example usage of SwingUtilities.invokeLater to update counters on the EDT
        SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                updateCounters();
            }
        });
    }

    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    javax.swing.JButton addGenreBtn;
    javax.swing.JButton addLikedBtn;
    javax.swing.JButton deleteSongBtn;
    javax.swing.JComboBox<String> genreSelectorList;
    javax.swing.JTable genreTableList;
    javax.swing.JLabel jLabel1;
    javax.swing.JLabel jLabel2;
    javax.swing.JLabel jLabel3;
    javax.swing.JLabel jLabel7;
    javax.swing.JScrollPane jScrollPane1;
    javax.swing.JScrollPane jScrollPane2;
    javax.swing.JTabbedPane jTabbedPane1;
    javax.swing.JLabel jazzCounter;
    javax.swing.JLabel likedSongsCounter;
    javax.swing.JList<String> likedSongsList;
    javax.swing.JButton playBtn;
    javax.swing.JButton repeatBtn;
    javax.swing.JButton searchBtn;
    javax.swing.JTextField songTitle;
    javax.swing.JLabel synthCounter;
    javax.swing.JPanel titleGenrePlaylist;
    javax.swing.JPanel titleGenrePlaylist1;
    javax.swing.JPanel titleLikedSongs;
    javax.swing.JPanel titlePanel;
    // End of variables declaration//GEN-END:variables

}
