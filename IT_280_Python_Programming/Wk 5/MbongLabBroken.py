import requests
from bs4 import BeautifulSoup

# URL of web pages to check
url = "https://si.instructure.com"
url = "https://learn.microsoft.com"
url = "https://code.visualstudio.com"

def check_links(url):
    try:
        response = requests.get(url)
        response.raise_for_status()  # Raise exception if request is unsuccessful
        soup = BeautifulSoup(response.text, 'html.parser')
        links = soup.find_all('a')

        for link in links:
            link_url = link.get('href')
            if link_url:
                if link_url.startswith('http') or link_url.startswith('https'):
                    link_response = requests.head(link_url)
                    if link_response.status_code == 200:
                        print(f"{link.text.strip()}: Good")
                    else:
                        print(f"{link.text.strip()}: Broken")

    except requests.exceptions.RequestException:
        print("Failed to retrieve the web page.")

check_links(url)
