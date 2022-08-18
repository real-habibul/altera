#!/bin/bash

#validate scanner $1 empty then give scanner name
if [ -z "$1" ]; then
  echo "Silahkan Masukkan Nama Folder"
  exit 1
fi
if [ -z "$2" ]; then
  echo "Silahkan Masukkan Nama Facebook"
  exit 1
fi
if [ -z "$3" ]; then
  echo "Silahkan Masukkan Nama Linkedin"
  exit 1
fi

date_time=$(date +"%a %b %d %H:%M:%S %Z %Y")
full_path="$1 $date_time"
mkdir "$full_path"
mkdir "$full_path/about_me" "$full_path/my_friends" "$full_path/my_system_info"
mkdir "$full_path/about_me/personal" "$full_path/about_me/professional"

touch "$full_path/about_me/personal/facebook.txt"
echo 'https://www.facebook.com/$2' >> "$full_path/about_me/personal/facebook.txt"

touch "$full_path/about_me/professional/linkedin.txt"
echo "https://www.linkedin.com/in/$3" >> "$full_path/about_me/professional/linkedin.txt"

curl --output "$full_path/my_friends/list_of_my_friends.txt" https://gist.githubusercontent.com/tegarimansyah/e91f335753ab2c7fb12815779677e914/raw/94864388379fecee450fde26e3e73bfb2bcda194/list%2520of%2520my%2520friends.txt

touch "$full_path/my_system_info/about_this_laptop.txt"
echo -e "My username : $USER\nWith host: $(uname -a)" >> "$full_path/my_system_info/about_this_laptop.txt"

touch "$full_path/my_system_info/internet_connection.txt"
ping -c 3 google.com >> "$full_path/my_system_info/internet_connection.txt"