import discord
import os
from discord.ext import commands
import requests
from bs4 import BeautifulSoup

TOKEN = 'MTE1OTY3ODU3MTI5NjYwODI3Ng.GC2FbE.w0NoolWiYUYAa3VeDnFwYE95qMb4vESsv3LCg0'

bot = commands.Bot(command_prefix='!')

@bot.event
async def on_ready():
    print(f'We are logged in as {bot.user.name}')

@bot.command(name='score')
async def get_live_score(ctx):
    try:
        url = 'https://www.espncricinfo.com/live-cricket-score'
        response = requests.get(url)
        soup = BeautifulSoup(response.text, 'html.parser')
        score_div = soup.find('div', {'class': 'match-info match-info-MATCH live'})
        match_title = score_div.find('span', {'class': 'description'}).text.strip()
        score = score_div.find('div', {'class': 'score'}).text.strip()
        
        await ctx.send(f"**{match_title}**\n{score}")
    except Exception as e:
        await ctx.send("Unable to fetch live cricket score at the moment.")

bot.run(TOKEN)
