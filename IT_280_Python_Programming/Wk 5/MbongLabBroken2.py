import requests
from bs4 import BeautifulSoup

# Function to check if a link is valid
def is_valid_link(url):
    try:
        response = requests.head(url)
        return response.status_code == 200
    except requests.ConnectionError:
        return False

# Function to get all links from a webpage
def get_links(url):
    links = []
    try:
        response = requests.get(url)
        soup = BeautifulSoup(response.text, 'html.parser')
        for link in soup.find_all('a'):
            links.append(link.get('href'))
        return links
    except requests.exceptions.MissingSchema:
        print("Invalid URL format. Make sure to include 'http://' or 'https://'.")
    except requests.exceptions.RequestException:
        print("An error occurred while trying to access the URL.")

# Ask the user for a webpage URL
webpage_url = input("Enter the URL of the webpage: ")

# Get all links on the page
links = get_links(webpage_url)

if links:
    print("\nList of links on the webpage and their status:")
    for link in links:
        if link:
            if is_valid_link(link):
                print(f"Link: {link} - Good")
            else:
                print(f"Link: {link} - Broken")
else:
    print("No links found on the webpage.")
